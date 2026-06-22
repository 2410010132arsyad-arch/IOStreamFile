package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan3 {

    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt"))) {
            penulis.println("Andi");
            penulis.println("Budi");
            penulis.println("Citra");
            System.out.println("Data berhasil ditulis ke mahasiswa.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // Latihan Mandiri 1
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            System.out.println("Data hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
    }
}