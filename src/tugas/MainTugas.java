package tugas;

// Nama : Muhammad Arsyad Syabani
// NPM  : 2410010132

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Kebutuhan Rumah Tangga"
        };

        System.out.println("== Daftar Kategori ==");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat objek Gudang dan mengisinya
        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Beras 5 Kg", 75000, 20));
        gudang.tambahBarang(new Barang("Minyak Goreng", 18000, 30));
        gudang.tambahBarang(new Barang("Gula Pasir", 16000, 25));
        gudang.tambahBarang(new Barang("Teh Celup", 12000, 15));
        gudang.tambahBarang(new Barang("Sabun Mandi", 5000, 40));

        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        System.out.println();

        // Membuat objek baru lalu memuat data dari berkas
        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total Nilai Persediaan : Rp" + gudangBaru.totalNilai());

    }

}