package com.mycompany.manajemenjadwalkegiatangerejaa.view;

import com.mycompany.manajemenjadwalkegiatangerejaa.controller.ManajemenKegiatan;
import java.util.Scanner;

public class InputValidator {

    public static String inputTeks(Scanner sc, String pesan) {
        System.out.print(pesan);
        return sc.nextLine();
    }

    public static String inputTeksWajib(
            Scanner sc,
            String pesan) {

        while (true) {

            String teks = inputTeks(sc, pesan).trim();

            if (!teks.isEmpty()) {
                return teks;
            }

            System.out.println(
                    "Input tidak boleh kosong!"
            );
        }
    }

    public static int inputAngka(
            Scanner sc,
            String pesan) {

        while (true) {

            System.out.print(pesan);

            try {

                int angka =
                        Integer.parseInt(sc.nextLine());

                if (angka >= 0) {
                    return angka;
                }

                System.out.println(
                        "Angka tidak boleh negatif!"
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input harus berupa angka!"
                );
            }
        }
    }

    public static String inputTanggal(
            Scanner sc,
            String pesan) {

        return inputTeksWajib(
                sc,
                pesan + " (dd-MM-yyyy): "
        );
    }

    public static String inputJam(
            Scanner sc,
            String pesan) {

        return inputTeksWajib(
                sc,
                pesan + " (HH:mm): "
        );
    }

    public static String inputIdKegiatanBaru(
            Scanner sc,
            ManajemenKegiatan m) {

        for (int i = 0; i < 3; i++) {

            String id = inputTeksWajib(
                    sc,
                    "ID Kegiatan: "
            );

            if (!m.idKegiatanAda(id)) {
                return id;
            }

            System.out.println(
                    "ID Kegiatan sudah digunakan!"
            );
        }

        System.out.println(
                "3 kali salah. Kembali ke menu utama."
        );

        return null;
    }

    public static String cariIdKegiatan(
            Scanner sc,
            ManajemenKegiatan m) {

        for (int i = 0; i < 3; i++) {

            String id = inputTeksWajib(
                    sc,
                    "ID Kegiatan: "
            );

            if (m.idKegiatanAda(id)) {
                return id;
            }

            System.out.println(
                    "ID Kegiatan tidak ditemukan!"
            );
        }

        System.out.println(
                "3 kali salah. Kembali ke menu utama."
        );

        return null;
    }

    public static String inputIdPetugasBaru(
            Scanner sc,
            ManajemenKegiatan m) {

        for (int i = 0; i < 3; i++) {

            String id = inputTeksWajib(
                    sc,
                    "ID Petugas: "
            );

            if (!m.idPetugasAda(id)) {
                return id;
            }

            System.out.println(
                    "ID Petugas sudah digunakan!"
            );
        }

        System.out.println(
                "3 kali salah. Kembali ke menu utama."
        );

        return null;
    }

    public static String cariIdPetugas(
            Scanner sc,
            ManajemenKegiatan m) {

        for (int i = 0; i < 3; i++) {

            String id = inputTeksWajib(
                    sc,
                    "ID Petugas: "
            );

            if (m.idPetugasAda(id)) {
                return id;
            }

            System.out.println(
                    "ID Petugas tidak ditemukan!"
            );
        }

        System.out.println(
                "3 kali salah. Kembali ke menu utama."
        );

        return null;
    }

    public static String inputIdPetugas(
            Scanner sc,
            ManajemenKegiatan m) {

        return cariIdPetugas(sc, m);
    }

    public static String inputIdTempatBaru(
            Scanner sc,
            ManajemenKegiatan m) {

        for (int i = 0; i < 3; i++) {

            String id = inputTeksWajib(
                    sc,
                    "ID Tempat: "
            );

            if (!m.idTempatAda(id)) {
                return id;
            }

            System.out.println(
                    "ID Tempat sudah digunakan!"
            );
        }

        System.out.println(
                "3 kali salah. Kembali ke menu utama."
        );

        return null;
    }

    public static String cariIdTempat(
            Scanner sc,
            ManajemenKegiatan m) {

        for (int i = 0; i < 3; i++) {

            String id = inputTeksWajib(
                    sc,
                    "ID Tempat: "
            );

            if (m.idTempatAda(id)) {
                return id;
            }

            System.out.println(
                    "ID Tempat tidak ditemukan!"
            );
        }

        System.out.println(
                "3 kali salah. Kembali ke menu utama."
        );

        return null;
    }

    public static String inputIdTempat(
            Scanner sc,
            ManajemenKegiatan m) {

        return cariIdTempat(sc, m);
    }
}