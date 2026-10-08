# Sistem Manajemen Jadwal Kegiatan Gereja (OMK)

## 1. Deskripsi Singkat Program

Sistem Manajemen Jadwal Kegiatan Gereja merupakan program berbasis Java yang digunakan untuk mengelola jadwal kegiatan, data petugas, dan tempat kegiatan gereja (OMK).

Program dijalankan melalui Command Line Interface (CLI) dan menggunakan ArrayList sebagai media penyimpanan data selama program berjalan.

Program menyediakan fitur CRUD (Create, Read, Update, Delete) pada tiga bagian utama, yaitu:

- Data Kegiatan
- Data Petugas
- Data Tempat

Selain fitur CRUD, program juga dilengkapi dengan validasi input dan proteksi relasi data. Proteksi tersebut digunakan untuk mencegah penghapusan petugas atau tempat yang masih digunakan oleh suatu kegiatan.

Program juga menerapkan yaitu:

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

<img width="557" height="317" alt="image" src="https://github.com/user-attachments/assets/eb77fc9c-a45b-4588-ad5a-4820e431af26" />

---

## 3. Alur Program

Ketika program dijalankan, sistem akan menampilkan menu utama yang berisi pilihan pengelolaan kegiatan, petugas, tempat, dan keluar dari program.
Menu utama terdiri dari:

<img width="340" height="330" alt="image" src="https://github.com/user-attachments/assets/efd907f9-7e8e-4baa-8fee-23b2be3be883" />

Pengguna memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia.


---

### 3.1 Kelola Kegiatan

Fitur yang tersedia:
- Lihat (Read): Menampilkan seluruh data kegiatan.
- Tambah (Create): Menambahkan data kegiatan baru.
- Ubah (Update): Mengubah data kegiatan berdasarkan ID.
- Hapus (Delete): Menghapus data kegiatan berdasarkan ID.
  
Data kegiatan terdiri dari informasi seperti ID, nama kegiatan, tanggal, jam, kategori, deskripsi, petugas, dan tempat.
Kegiatan dibedakan menjadi dua kategori, yaitu:
- Ibadah
- Sosial

