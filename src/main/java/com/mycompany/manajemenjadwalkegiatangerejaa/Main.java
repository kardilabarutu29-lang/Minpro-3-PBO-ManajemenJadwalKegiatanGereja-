package com.mycompany.manajemenjadwalkegiatangerejaa;

import com.mycompany.manajemenjadwalkegiatangerejaa.controller.ManajemenKegiatan;
import com.mycompany.manajemenjadwalkegiatangerejaa.model.Kegiatan;
import com.mycompany.manajemenjadwalkegiatangerejaa.model.KegiatanIbadah;
import com.mycompany.manajemenjadwalkegiatangerejaa.model.KegiatanSosial;
import com.mycompany.manajemenjadwalkegiatangerejaa.view.InputValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ManajemenKegiatan m = new ManajemenKegiatan();

        int pilih;

        do {

            System.out.println("\n=== SISTEM MANAJEMEN GEREJA ===");
            System.out.println(
                    "1. Kelola Kegiatan | "
                    + "2. Kelola Petugas | "
                    + "3. Kelola Tempat | "
                    + "0. Keluar"
            );

            pilih = InputValidator.inputAngka(
                    sc,
                    "Pilih: "
            );

            switch (pilih) {

                case 1 -> menuKegiatan(sc, m);

                case 2 -> menuPetugas(sc, m);

                case 3 -> menuTempat(sc, m);

                case 0 ->
                        System.out.println(
                                "Program selesai."
                        );

                default ->
                        System.out.println(
                                "Pilihan tidak tersedia!"
                        );
            }

        } while (pilih != 0);

        sc.close();
    }

    // =====================================================
    // MENU KEGIATAN
    // =====================================================

    static void menuKegiatan(
            Scanner sc,
            ManajemenKegiatan m) {

        int pilih;

        do {

            System.out.println("\n--- KELOLA KEGIATAN ---");
            System.out.println(
                    "1. Lihat | "
                    + "2. Tambah | "
                    + "3. Ubah | "
                    + "4. Hapus | "
                    + "0. Kembali"
            );

            pilih = InputValidator.inputAngka(
                    sc,
                    "Pilih: "
            );

            switch (pilih) {

                case 1 -> {

                    System.out.println(
                            "\n--- DATA KEGIATAN ---"
                    );

                    m.tampilKegiatan();
                }

                case 2 -> tambahKegiatan(sc, m);

                case 3 -> editKegiatan(sc, m);

                case 4 -> hapusKegiatan(sc, m);

                case 0 -> {
                }

                default ->
                        System.out.println(
                                "Pilihan tidak tersedia!"
                        );
            }

        } while (pilih != 0);
    }

    // TAMBAH KEGIATAN

    static void tambahKegiatan(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- TAMBAH KEGIATAN ---"
        );

        String id =
                InputValidator.inputIdKegiatanBaru(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        String nama =
                InputValidator.inputTeksWajib(
                        sc,
                        "Nama Kegiatan: "
                );

        String tanggal =
                InputValidator.inputTanggal(
                        sc,
                        "Tanggal"
                );

        String jam =
                InputValidator.inputJam(
                        sc,
                        "Jam"
                );

        String kategori;

        while (true) {

            kategori =
                    InputValidator.inputTeksWajib(
                            sc,
                            "Kategori (Ibadah/Sosial): "
                    );

            if (kategori.equalsIgnoreCase("Ibadah")
                    || kategori.equalsIgnoreCase("Sosial")) {

                break;
            }

            System.out.println(
                    "Kategori harus Ibadah atau Sosial!"
            );
        }

        String deskripsi =
                InputValidator.inputTeksWajib(
                        sc,
                        "Deskripsi: "
                );

        String idPetugas =
                InputValidator.inputIdPetugas(
                        sc,
                        m
                );

        if (idPetugas == null) {
            return;
        }

        String idTempat =
                InputValidator.inputIdTempat(
                        sc,
                        m
                );

        if (idTempat == null) {
            return;
        }

        Kegiatan kegiatan;

        if (kategori.equalsIgnoreCase("Ibadah")) {

            kegiatan = new KegiatanIbadah(
                    id,
                    nama,
                    tanggal,
                    jam,
                    "Ibadah",
                    deskripsi,
                    idPetugas,
                    idTempat
            );

        } else {

            kegiatan = new KegiatanSosial(
                    id,
                    nama,
                    tanggal,
                    jam,
                    "Sosial",
                    deskripsi,
                    idPetugas,
                    idTempat
            );
        }

        m.tambahKegiatan(kegiatan);

        System.out.println(
                "Kegiatan berhasil ditambahkan."
        );
    }

    // UBAH KEGIATAN

    static void editKegiatan(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- UBAH KEGIATAN ---"
        );

        String id =
                InputValidator.cariIdKegiatan(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        String nama =
                InputValidator.inputTeksWajib(
                        sc,
                        "Nama Baru: "
                );

        String tanggal =
                InputValidator.inputTanggal(
                        sc,
                        "Tanggal Baru"
                );

        String jam =
                InputValidator.inputJam(
                        sc,
                        "Jam Baru"
                );

        String kategori;

        while (true) {

            kategori =
                    InputValidator.inputTeksWajib(
                            sc,
                            "Kategori Baru (Ibadah/Sosial): "
                    );

            if (kategori.equalsIgnoreCase("Ibadah")
                    || kategori.equalsIgnoreCase("Sosial")) {

                break;
            }

            System.out.println(
                    "Kategori harus Ibadah atau Sosial!"
            );
        }

        String deskripsi =
                InputValidator.inputTeksWajib(
                        sc,
                        "Deskripsi Baru: "
                );

        boolean berhasil =
                m.editKegiatan(
                        id,
                        nama,
                        tanggal,
                        jam,
                        kategori,
                        deskripsi
                );

        if (berhasil) {

            System.out.println(
                    "Kegiatan berhasil diubah."
            );

        } else {

            System.out.println(
                    "Kegiatan gagal diubah."
            );
        }
    }

    // HAPUS KEGIATAN

    static void hapusKegiatan(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- HAPUS KEGIATAN ---"
        );

        String id =
                InputValidator.cariIdKegiatan(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        if (m.hapusKegiatan(id)) {

            System.out.println(
                    "Kegiatan berhasil dihapus."
            );

        } else {

            System.out.println(
                    "Kegiatan gagal dihapus."
            );
        }
    }

    // MENU PETUGAS

    static void menuPetugas(
            Scanner sc,
            ManajemenKegiatan m) {

        int pilih;

        do {

            System.out.println("\n--- KELOLA PETUGAS ---");
            System.out.println(
                    "1. Lihat | "
                    + "2. Tambah | "
                    + "3. Ubah | "
                    + "4. Hapus | "
                    + "0. Kembali"
            );

            pilih = InputValidator.inputAngka(
                    sc,
                    "Pilih: "
            );

            switch (pilih) {

                case 1 -> {

                    System.out.println(
                            "\n--- DATA PETUGAS ---"
                    );

                    m.tampilPetugas();
                }

                case 2 -> tambahPetugas(sc, m);

                case 3 -> editPetugas(sc, m);

                case 4 -> hapusPetugas(sc, m);

                case 0 -> {
                }

                default ->
                        System.out.println(
                                "Pilihan tidak tersedia!"
                        );
            }

        } while (pilih != 0);
    }

    // TAMBAH PETUGAS

    static void tambahPetugas(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- TAMBAH PETUGAS ---"
        );

        String id =
                InputValidator.inputIdPetugasBaru(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        String nama =
                InputValidator.inputTeksWajib(
                        sc,
                        "Nama: "
                );

        String peran =
                InputValidator.inputTeksWajib(
                        sc,
                        "Peran: "
                );

        String noHp =
                InputValidator.inputTeksWajib(
                        sc,
                        "No HP: "
                );

        m.tambahPetugas(
                id,
                nama,
                peran,
                noHp
        );

        System.out.println(
                "Petugas berhasil ditambahkan."
        );
    }

    // UBAH PETUGAS

    static void editPetugas(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- UBAH PETUGAS ---"
        );

        String id =
                InputValidator.cariIdPetugas(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        String nama =
                InputValidator.inputTeksWajib(
                        sc,
                        "Nama Baru: "
                );

        String peran =
                InputValidator.inputTeksWajib(
                        sc,
                        "Peran Baru: "
                );

        String noHp =
                InputValidator.inputTeksWajib(
                        sc,
                        "No HP Baru: "
                );

        if (m.editPetugas(
                id,
                nama,
                peran,
                noHp)) {

            System.out.println(
                    "Petugas berhasil diubah."
            );

        } else {

            System.out.println(
                    "Petugas gagal diubah."
            );
        }
    }

    // HAPUS PETUGAS

    static void hapusPetugas(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- HAPUS PETUGAS ---"
        );

        String id =
                InputValidator.cariIdPetugas(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        if (m.hapusPetugas(id)) {

            System.out.println(
                    "Petugas berhasil dihapus."
            );
        }
    }

    // MENU TEMPAT

    static void menuTempat(
            Scanner sc,
            ManajemenKegiatan m) {

        int pilih;

        do {

            System.out.println("\n--- KELOLA TEMPAT ---");
            System.out.println(
                    "1. Lihat | "
                    + "2. Tambah | "
                    + "3. Ubah | "
                    + "4. Hapus | "
                    + "0. Kembali"
            );

            pilih = InputValidator.inputAngka(
                    sc,
                    "Pilih: "
            );

            switch (pilih) {

                case 1 -> {

                    System.out.println(
                            "\n--- DATA TEMPAT ---"
                    );

                    m.tampilTempat();
                }

                case 2 -> tambahTempat(sc, m);

                case 3 -> editTempat(sc, m);

                case 4 -> hapusTempat(sc, m);

                case 0 -> {
                }

                default ->
                        System.out.println(
                                "Pilihan tidak tersedia!"
                        );
            }

        } while (pilih != 0);
    }

    // TAMBAH TEMPAT

    static void tambahTempat(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- TAMBAH TEMPAT ---"
        );

        String id =
                InputValidator.inputIdTempatBaru(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        String nama =
                InputValidator.inputTeksWajib(
                        sc,
                        "Nama Tempat: "
                );

        String lokasi =
                InputValidator.inputTeksWajib(
                        sc,
                        "Lokasi: "
                );

        int kapasitas =
                InputValidator.inputAngka(
                        sc,
                        "Kapasitas: "
                );

        m.tambahTempat(
                id,
                nama,
                lokasi,
                kapasitas
        );

        System.out.println(
                "Tempat berhasil ditambahkan."
        );
    }

    // UBAH TEMPAT

    static void editTempat(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- UBAH TEMPAT ---"
        );

        String id =
                InputValidator.cariIdTempat(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        String nama =
                InputValidator.inputTeksWajib(
                        sc,
                        "Nama Baru: "
                );

        String lokasi =
                InputValidator.inputTeksWajib(
                        sc,
                        "Lokasi Baru: "
                );

        int kapasitas =
                InputValidator.inputAngka(
                        sc,
                        "Kapasitas Baru: "
                );

        if (m.editTempat(
                id,
                nama,
                lokasi,
                kapasitas)) {

            System.out.println(
                    "Tempat berhasil diubah."
            );

        } else {

            System.out.println(
                    "Tempat gagal diubah."
            );
        }
    }

    // HAPUS TEMPAT

    static void hapusTempat(
            Scanner sc,
            ManajemenKegiatan m) {

        System.out.println(
                "\n--- HAPUS TEMPAT ---"
        );

        String id =
                InputValidator.cariIdTempat(
                        sc,
                        m
                );

        if (id == null) {
            return;
        }

        if (m.hapusTempat(id)) {

            System.out.println(
                    "Tempat berhasil dihapus."
            );
        }
    }
}