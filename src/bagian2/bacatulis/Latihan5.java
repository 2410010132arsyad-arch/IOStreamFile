package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Latihan5 {

    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true))) {
            penulis.println("Dewi");
            penulis.println("Eka");
            System.out.println("Dua nama baru ditambahkan tanpa menghapus data lama.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        // Latihan Mandiri 2
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Dua nama hari berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}