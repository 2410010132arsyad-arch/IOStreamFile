package tugas;

public class Barang {

    // Atribut: data yang dimiliki setiap barang
    private final String nama;
    private final double harga;
    private final int stok;

    // Constructor: dipanggil saat objek dibuat
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter: cara membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan keterangan barang dalam bentuk teks
    public String info() {
        return nama + " - Rp" + harga + " - Stok: " + stok;
    }

}