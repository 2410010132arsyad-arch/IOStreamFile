package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Latihan1 {

    public static void main(String[] args) throws IOException {

        File berkas = new File("catatan.txt");

        if (berkas.createNewFile()) {
            System.out.println("Berkas dibuat : " + berkas.getName());
        } else {
            System.out.println("Berkas sudah ada : " + berkas.getName());
        }

        System.out.println("Apakah ada? : " + berkas.exists());
        System.out.println("Path absolut : " + berkas.getAbsolutePath());
        System.out.println("Ukuran (byte) : " + berkas.length());
        System.out.println("Dapat dibaca : " + berkas.canRead());

        // Latihan Mandiri 1
        File laporan = new File("laporan.txt");

        System.out.println("Apakah laporan.txt ada? " + laporan.exists());

        if (laporan.exists()) {
            System.out.println("Ukuran file : " + laporan.length() + " byte");
        }

        // Latihan Mandiri 2
        File arsip = new File("arsip");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip sudah ada atau gagal dibuat.");
        }
    }
}