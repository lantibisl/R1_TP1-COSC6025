import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa mahasiswa : daftar) {
            mahasiswa.tampilkanInfo();
            System.out.println();
        }

        inputIpk(daftar);
        getPredikat(daftar[2]);
    }

    private static void inputIpk(Mahasiswa[] daftar) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nim = scanner.nextLine();
        boolean mahasiswaDitemukan = false;

        for (Mahasiswa mahasiswa : daftar) {
            if (mahasiswa.getNim().equals(nim)) {
                mahasiswaDitemukan = true;

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = scanner.nextDouble();
                mahasiswa.updateIpk(ipkBaru);

                System.out.println("Data berhasil diperbarui!");
                System.out.println();
                System.out.println("=== Data Mahasiswa ===");
                mahasiswa.tampilkanInfo();
                System.out.println("Status: " + mahasiswa.cekKelulusan());
                System.out.println();
            
                break;
            }
        }
        if (!mahasiswaDitemukan) {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
        scanner.close();
    }

    private static void getPredikat(Mahasiswa mahasiswa) {
        System.out.println("=== Data Mahasiswa ===");
        mahasiswa.tampilkanInfo();
        System.out.println("Status: " + mahasiswa.cekKelulusan());
        System.out.println("Predikat: " + mahasiswa.hitungPredikat());
    }
}