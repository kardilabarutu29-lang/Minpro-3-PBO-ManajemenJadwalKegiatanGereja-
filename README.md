# Sistem Manajemen Jadwal Kegiatan Gereja (OMK)

## 1. Deskripsi Singkat Program

Sistem Manajemen Jadwal Kegiatan Gereja merupakan program berbasis Java yang digunakan untuk mengelola jadwal kegiatan, data petugas, dan tempat kegiatan gereja (OMK).

Program dijalankan melalui Command Line Interface (CLI) dan menggunakan `ArrayList` sebagai media penyimpanan data selama program berjalan.

Program menyediakan fitur CRUD (Create, Read, Update, Delete) pada tiga bagian utama, yaitu:

- Data Kegiatan
- Data Petugas
- Data Tempat

Selain fitur CRUD, program juga dilengkapi dengan validasi input dan proteksi relasi data. Proteksi tersebut digunakan untuk mencegah penghapusan petugas atau tempat yang masih digunakan oleh suatu kegiatan.

Program juga menerapkan beberapa konsep Pemrograman Berorientasi Objek (PBO), yaitu:

- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Overriding
- Overloading

Struktur program juga menggunakan pola MVC (Model, View, Controller) untuk memisahkan bagian data, tampilan, dan pengelolaan proses program.

---

## 2. Struktur Package

Program menggunakan pembagian package untuk membuat struktur kode lebih terorganisir.

Secara umum, program menggunakan tiga bagian utama dalam pola MVC:

```text
Source Packages
│
├── model
│   ├── Kegiatan.java
│   ├── KegiatanIbadah.java
│   ├── KegiatanSosial.java
│   ├── Petugas.java
│   └── Tempat.java
│
├── view
│   └── InputValidator.java
│
└── controller
    └── ManajemenKegiatan.java
