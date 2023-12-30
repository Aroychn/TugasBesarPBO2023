
package IniKuis;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int totalSkor;

    // Getter dan Setter untuk 'nama'
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk 'nim'
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk 'totalSkor'
    public int getTotalSkor() {
        return totalSkor;
    }

    public void setTotalSkor(int totalSkor) {
        this.totalSkor = totalSkor;
    }

    // Konstruktor

    public Mahasiswa() {
        // Inisialisasi konstruktor jika diperlukan
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama ());
        System.out.println("NIM: " + getNim());
        System.out.println("Point : " + getTotalSkor());
    }

}


