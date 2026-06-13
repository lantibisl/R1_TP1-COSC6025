public class Mahasiswa {
    // Atribut untuk menyimpan data mahasiswa
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Konstruktor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter dan setter untuk atribut mahasiswa
    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method untuk memperbarui IPK mahasiswa
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n", ipk);
    }

    // Method untuk mengecek kelulusan mahasiswa
    public String cekKelulusan() {
        if (ipk >= 3.0) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    // Method untuk menghitung predikat mahasiswa berdasarkan IPK
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.0) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
}