
package IniKuis;

public class KuisBahasaJava implements Kuis {
    private static final String[] SOAL = {
        
   // soal nomor 1
        """
        Apa yang akan terjadi jika Anda mencoba membuat objek dari kelas abstrak?
        a. Kompilasi error
        b. Objek akan dibuat tanpa masalah
        c. Atribut objek akan diabaikan
        d. Java akan secara otomatis menginisialisasi kelas tersebut
        """,
   // soal nomor 2
        """
        Apa istilah yang biasa digunakan untuk menyembunyikan implementasi suatu kelas dan hanya menampilkan antarmuka publiknya?
        a. Camouflage
        b. Encapsulation
        c. Disguise
        d. Interface hiding
        """,
    // soal nomor 3   
        """
        Apa manfaat utama menggunakan konsep polimorfisme dalam desain perangkat lunak?
        a. Meningkatkan keamanan
        b. Memudahkan debugging
        c. Meningkatkan kinerja
        d. Meningkatkan fleksibilitas dan dapat dipelihara
        """,
    // soal nomor 4    
        """
        Bagaimana cara membuat objek dengan satu baris kode tanpa mendeklarasikan variabelnya terlebih dahulu?
        a. new Object()
        b. createNewObject()
        c. Object obj = Object.create()
        d. new Object().create()
        """,
    // soal nomor 5    
        """
        Apa yang dimaksud dengan "JavaBeans" dalam konteks Pemrograman Java?
        a. Kacang yang dipanggang dengan Java
        b. Komponen perangkat lunak yang dapat digunakan kembali
        c. Pohon kacang khas pulau Java
        d. Varietas kacang yang ditanam di Jawa
        """,
    // soal nomor 6    
        """
        Apa perbedaan antara super() dan this() dalam konstruktor kelas turunan?
        a. super() menginisialisasi objek saat ini, this() menginisialisasi objek kelas induk
        b. this() menginisialisasi objek saat ini, super() menginisialisasi objek kelas induk
        c. Keduanya digunakan untuk menginisialisasi variabel statis
        d. Tidak ada perbedaan antara keduanya
        """,
    // soal nomor 7    
        """
        Apa yang dimaksud dengan "inner class" dalam Java?
        a. Kelas yang tersembunyi dan tidak dapat diakses dari luar kelas tersebut
        b. Kelas yang berada di dalam paket tertentu
        c. Kelas yang hanya berisi metode statis
        d. Kelas yang hanya dapat diakses oleh kelas lain dalam hierarki pewarisan
        """,
    // soal nomor 8    
        """
        Bagaimana cara menghindari "NullPointerException" dalam Java?
        a. Selalu menggunakan variabel null
        b. Memeriksa apakah variabel null sebelum mengaksesnya
        c. Menyembunyikan semua variabel dengan kata kunci private
        d. Menggunakan finally setiap kali melakukan operasi
        """,
    // soal nomor 9
        """
        Apa yang terjadi jika sebuah kelas mengimplementasikan dua antarmuka yang memiliki metode dengan nama yang sama?
        a. Kompilasi error
        b. Metode tersebut secara otomatis menjadi statis
        c. Kedua metode dijalankan secara bersamaan
        d. Java secara otomatis menyelesaikan konflik dengan menambahkan implementasi default
        """,
    // soal nomor 10    
        """
        Apa kegunaan dari kata kunci volatile pada variabel dalam Java?
        a. Menandakan bahwa variabel tidak dapat diubah
        b. Memastikan bahwa setiap perubahan pada variabel terlihat oleh semua thread
        c. Mencegah variabel dari garbage collection
        d. Menandakan bahwa variabel hanya dapat diakses oleh satu thread pada satu waktu
        """,
    
    
    };
        
        
    private static final String[] JAWABAN = {
    //jawaban soal nomor 1
        "a",
    //jawaban soal nomor 2
        "b",
    //jawaban soal nomor 3    
        "d",
    //jawaban soal nomor 4    
        "a",
    //jawaban soal nomor 5    
        "b",
    //jawaban soal nomor 6    
        "b",
    //jawaban soal nomor 7    
        "a",
    //jawaban soal nomor 8    
        "b",
    //jawaban soal nomor 9    
        "a",
    //jawaban soal nomor 10    
        "b"            
    };

    private int skor;
    private int currentQuestionIndex; // Menyimpan indeks soal yang sedang ditampilkan
    private boolean isFinished;
    
    public KuisBahasaJava() {
        this.currentQuestionIndex = 0; // Inisialisasi indeks soal pertama
        this.isFinished = false;
    }

    @Override
    public void tampilkanSoal() {
        if (!isFinished && currentQuestionIndex < SOAL.length) {
            System.out.println("Soal " + (currentQuestionIndex + 1) + ": " + SOAL[currentQuestionIndex]);
        } else {
            System.out.println("Semua soal telah dijawab.");
            isFinished = true;
        }
    }

    @Override
    public int nilaiJawaban(String jawaban) {
        int skorSoal = 0;

        if (!isFinished && currentQuestionIndex < JAWABAN.length) {
            if (jawaban.equalsIgnoreCase(JAWABAN[currentQuestionIndex])) {
                skorSoal = 10;
            }

            System.out.println("Jawaban untuk Soal " + (currentQuestionIndex + 1) + ": " + (skorSoal > 0 ? "Benar" : "Salah"));

            skor += skorSoal;
            currentQuestionIndex += 1; // Pindah ke soal berikutnya

            if (currentQuestionIndex == SOAL.length) {
                isFinished = true; // Jika sudah menjawab semua soal
            }
        } else {
            System.out.println("Semua soal telah dijawab. Tidak ada soal lagi.");
            isFinished = true;
        }

        return skorSoal;
    }

    @Override
    public int getSkor() {
        return skor;
    }

    @Override
        public boolean isFinished() {
        return isFinished;
    }
}
