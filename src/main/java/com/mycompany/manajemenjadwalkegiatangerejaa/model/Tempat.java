package com.mycompany.manajemenjadwalkegiatangerejaa.model;

public class Tempat {

    private final String id;
    private String nama;
    private String lokasi;
    private int kapasitas;

    public Tempat(String id, String nama, String lokasi, int kapasitas) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
