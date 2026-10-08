package com.mycompany.manajemenjadwalkegiatangerejaa.model;

public class Petugas {

    private final String id;
    private String nama;
    private String peran;
    private String noHp;

    public Petugas(String id, String nama, String peran, String noHp) {
        this.id = id;
        this.nama = nama;
        this.peran = peran;
        this.noHp = noHp;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}