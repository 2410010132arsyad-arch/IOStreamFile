package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Latihan2 {

    public static void main(String[] args) {

        File berkas = new File("data.txt");

        try {

            if (berkas.createNewFile()) {
                System.out.println("Berkas baru dibuat.");
            } else {
                System.out.println("Berkas sudah ada sebelumnya.");
            }

            // Latihan Mandiri 3
            File sementara = new File("sementara.txt");

            sementara.createNewFile();

            System.out.println("Sebelum dihapus : " + sementara.exists());

            sementara.delete();

            System.out.println("Sesudah dihapus : " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }
    }
}