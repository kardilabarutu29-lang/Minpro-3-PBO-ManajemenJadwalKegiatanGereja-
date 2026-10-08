package com.mycompany.manajemenjadwalkegiatangerejaa.model;

public class KegiatanSosial extends Kegiatan {

    public KegiatanSosial(String id, String nama, String tanggal,
            String jam, String kategori, String deskripsi,
            String idPetugas, String idTempat) {

        super(id, nama, tanggal, jam, kategori,
                deskripsi, idPetugas, idTempat);
    }


    @Override
    public String getJenisKegiatan() {
        return "Sosial";
    }

    @Override
    public String tampilInfo() {
        return "[SOSIAL] " + super.tampilInfo();
    }
}