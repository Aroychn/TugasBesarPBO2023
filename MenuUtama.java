package IniKuis;

import java.util.Scanner;

public class MenuUtama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Kuis Java PBO");
        System.out.println("1. Mulai");
        System.out.println("2. Tentang");
        System.out.println("3. Keluar");

        System.out.print("Pilih menu: ");
        int pilihanMenu = scanner.nextInt();

        switch (pilihanMenu) {
            case 1 -> {
                System.out.println("Selamat datang di KJP\nKuis Java PBO");
                System.out.print("Masukkan nama : ");
                scanner.nextLine();  // Menambahkan ini untuk mengonsumsi newline character sebelumnya
                mahasiswa.setNama(scanner.nextLine());
                System.out.print("Masukkan NIM : ");
                mahasiswa.setNim(scanner.nextLine());

                System.out.println("Silahkan pilih kuis mu : ");
                System.out.println("1. Kuis Java PBO");

                System.out.print("Pilih kuis : ");
                int pilihanKuis = scanner.nextInt();

                Kuis kuis = null;

                switch (pilihanKuis) {
                    case 1 -> kuis = new KuisBahasaJava();
                    default -> {
                        System.out.println("Pilihan kuis tidak valid.");
                        return;
                    }
                }

                if (kuis != null) {
                    while (!kuis.isFinished()) {
                        kuis.tampilkanSoal();
                        System.out.print("Jawab : ");
                        String jawaban = scanner.next();
                        int skor = kuis.nilaiJawaban(jawaban);

                        if (skor > 0) {
                            System.out.println("10 point");
                        } else {
                            System.out.println("0 point");
                        }

                        System.out.println();
                    }

                    System.out.println("Nama: " + mahasiswa.getNama());
                    System.out.println("NIM: " + mahasiswa.getNim());
                    System.out.println("Skor: " + kuis.getSkor());
                }
            }

            case 2 -> {
                System.out.println("Console ini dibuat dengan sukacita");
                System.out.println("Achmad Roychan");
                System.out.println("32602200027");
            }

            case 3 -> System.out.println("Keluar dari program.");

            default -> System.out.println("Pilihan tidak valid.");
        }
    }
}
