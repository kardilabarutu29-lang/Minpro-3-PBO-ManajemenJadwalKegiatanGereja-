package com.mycompany.manajemenjadwalkegiatangerejaa.model;

public class KegiatanIbadah extends Kegiatan {

    public KegiatanIbadah(String id, String nama, String tanggal,
            String jam, String kategori, String deskripsi,
            String idPetugas, String idTempat) {

        super(id, nama, tanggal, jam, kategori,
                deskripsi, idPetugas, idTempat);
    }

    @Override
    public String getJenisKegiatan() {
        return "Ibadah";
    }

  
    @Override
    public String tampilInfo() {
        return "[IBADAH] " + super.tampilInfo();
    }
}