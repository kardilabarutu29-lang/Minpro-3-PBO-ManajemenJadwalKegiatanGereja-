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

<img width="587" height="320" alt="image" src="https://github.com/user-attachments/assets/45480963-c62d-4305-b999-25665d0ca9c1" />


---

## 3. Alur Program

Ketika program dijalankan, sistem akan menampilkan menu utama yang berisi pilihan pengelolaan kegiatan, petugas, tempat, dan keluar dari program.
Menu utama terdiri dari:

<img width="671" height="152" alt="image" src="https://github.com/user-attachments/assets/382da0ba-5ce3-407f-90e4-842eb1a8110a" />

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

<img width="656" height="327" alt="image" src="https://github.com/user-attachments/assets/62e60c6d-78e4-4872-b93a-06c890d727bf" />


---

### 3.2 Kelola Petugas

Menu Kelola Petugas digunakan untuk mengelola data petugas yang terlibat dalam kegiatan.
Fitur yang tersedia:
- Lihat data petugas.
- Tambah petugas.
- Ubah data petugas.
- Hapus data petugas.
Data petugas terdiri dari:
- ID
- Nama
- Peran
- Nomor HP  
Sistem akan menolak penghapusan petugas apabila petugas tersebut masih digunakan oleh suatu kegiatan.

<img width="652" height="333" alt="image" src="https://github.com/user-attachments/assets/cef46375-5e8d-44ce-9ea6-b3d445873f07" />


---

### 3.3 Kelola Tempat

Menu Kelola Tempat digunakan untuk mengelola tempat yang digunakan untuk kegiatan gereja.
Fitur yang tersedia:
- Lihat data tempat.
- Tambah tempat.
- Ubah data tempat.
- Hapus tempat.
Data tempat terdiri dari:
- ID
- Nama tempat
- Lokasi
- Kapasitas

<img width="627" height="371" alt="image" src="https://github.com/user-attachments/assets/6235b3e1-17d1-487a-beb8-489e330bb859" />


---

### 3.4 Keluar

Menu Keluar digunakan untuk menghentikan eksekusi program.

<img width="675" height="325" alt="image" src="https://github.com/user-attachments/assets/cfcbfaa8-ac51-4c36-80f0-9b9a99b0b75a" />



---

## 4. Encapsulation

Penerapan Encapsulation


Encapsulation diterapkan dengan membatasi akses langsung terhadap atribut class menggunakan access modifier Private


<img width="432" height="247" alt="image" src="https://github.com/user-attachments/assets/3f58789f-da91-4a8a-ac87-e185640af8a0" />


Untuk mengakses dan mengubah data digunakan method getter dan setter.

<img width="537" height="897" alt="image" src="https://github.com/user-attachments/assets/a3f4adf1-ab59-41f5-9452-f0ebece16287" />



---

## 5. Inhetitance

Inheritance digunakan untuk membentuk hubungan antara superclass dan subclass.

Pada program ini, Kegiatan menjadi class dasar yang memiliki turunan:

<img width="458" height="97" alt="image" src="https://github.com/user-attachments/assets/95ddc564-f3b3-4052-8bed-b203b41b05e2" />

Class KegiatanIbadah dan KegiatanSosial merupakan subclass dari Kegiatan.

Penerapan inheritance menggunakan keyword extends.

<img width="723" height="245" alt="image" src="https://github.com/user-attachments/assets/c6affc8f-3fae-4ad8-ac26-8b4e85d743d0" />


<img width="736" height="311" alt="image" src="https://github.com/user-attachments/assets/8d428354-cc09-40e1-90fc-686005ecddaf" />




---

## 6. Abstraction

Abstraction digunakan untuk membuat class dasar yang mewakili konsep umum dari suatu objek.
Pada program ini, konsep kegiatan digunakan sebagai dasar untuk membentuk kegiatan ibadah dan kegiatan sosial.

Apabila class Kegiatan digunakan sebagai abstract class, maka class tersebut berfungsi sebagai class dasar yang tidak digunakan untuk membuat objek kegiatan secara langsung.

Konsep abstraction membantu program dalam menentukan struktur umum yang harus dimiliki oleh objek kegiatan.


---

### 6.1 Abstract Class

Abstract class digunakan sebagai class dasar bagi subclass.

Struktur hubungan class:

<img width="536" height="107" alt="image" src="https://github.com/user-attachments/assets/f2ae3c84-4307-436f-b47e-9188786ef52f" />

Dengan struktur tersebut, jenis kegiatan dapat dikembangkan melalui subclass yang berbeda.


---

### 6.2 Abstract Method

Abstract method digunakan untuk menentukan method yang harus diimplementasikan oleh subclass.

Setiap subclass dapat memberikan implementasi sesuai dengan karakteristik masing-masing jenis kegiatan.


---

## 7. Polymorphism

Polymorphism memungkinkan objek dari subclass memberikan perilaku yang berbeda meskipun berasal dari superclass yang sama.

Pada program ini, polymorphism diterapkan melalui overriding dan overloading.


---

### 7.1 Overriding
Overriding terjadi ketika subclass memberikan implementasi terhadap method yang berasal dari superclass.

Contoh penerapan ditandai dengan penggunaan:

<img width="642" height="292" alt="image" src="https://github.com/user-attachments/assets/339a6c67-6fa5-49db-a5c1-79b505429b8b" />

Method yang sama dapat memberikan hasil berbeda berdasarkan subclass yang digunakan.

Pada kegiatan ibadah, method dapat memberikan informasi bahwa kegiatan merupakan kegiatan Ibadah.

---

### 7.2 Overloading

Overloading terjadi ketika terdapat beberapa method dengan nama yang sama tetapi memiliki parameter yang berbeda.

Contohnya dapat diterapkan pada method yang memiliki bentuk pemanggilan berbeda sesuai dengan kebutuhan program.


---

## 8. Nilai Tamhah Program

Selain fitur utama CRUD dan penerapan konsep PBO, program memiliki beberapa fitur tambahan.

---

### 8.1 Validasi Input

Validasi input digunakan untuk mengantisipasi kesalahan pengguna ketika memasukkan data.
Validasi yang diterapkan meliputi:
- Input teks tidak boleh kosong.
- Input angka harus berupa angka.
- Angka tidak boleh bernilai negatif.
- ID kegiatan tidak boleh sama.
- ID petugas tidak boleh sama.
- ID tempat tidak boleh sama.
- ID yang dicari harus tersedia.
- Kesalahan input ID dibatasi hingga tiga kali.
Apabila pengguna melakukan kesalahan hingga batas yang ditentukan, sistem akan mengembalikan pengguna ke menu utama.


---

### 8.2 Kategori Kegiatan

Program membedakan kegiatan menjadi dua kategori, yaitu:
- Ibadah
- Sosial
  
Kategori digunakan untuk memudahkan pengguna mengetahui jenis kegiatan yang sedang dikelola.


---

### 8.3 Dummy Data

Program menyediakan dummy data agar pengguna dapat langsung melihat contoh data ketika program dijalankan.
Dummy data terdiri dari:
- Data petugas
- Data tempat
- Data kegiatan

  
Dengan adanya dummy data, proses pengujian program dapat dilakukan sejak awal program dijalankan.


---

### 8.4 Pengelolaan ArrayList

Program menggunakan ArrayList untuk menyimpan data secara dinamis selama program berjalan.


---

### 8.5 Proteksi Relasi Data

Program memiliki proteksi terhadap penghapusan data yang masih memiliki hubungan dengan kegiatan.


<img width="673" height="375" alt="image" src="https://github.com/user-attachments/assets/5a98ef7b-91b4-4e19-a398-44947a11075e" />


Petugas tidak dapat dihapus apabila masih digunakan dalam suatu kegiatan.



<img width="686" height="252" alt="image" src="https://github.com/user-attachments/assets/c15bca7c-ee9c-42d8-8829-6dc1c190bcf4" />


Tempat juga tidak dapat dihapus apabila masih digunakan dalam suatu kegiatan.



---

## 9. Penerapan MVC

Program menggunakan pola MVC (Model, View, Controller) untuk memisahkan bagian data, tampilan, dan proses pengelolaan program.



---

### 9.1 Model

Model berisi class yang merepresentasikan data dan objek dalam sistem.

Class yang termasuk dalam Model adalah:
- Kegiatan
- KegiatanIbadah
- KegiatanSosial
- Petugas
- Tempat

---

### 9.2 View

View berhubungan dengan interaksi pengguna dan proses input.

Bagian ini digunakan untuk membantu pengguna memasukkan data serta menerima informasi yang diberikan oleh program.

Class InputValidator digunakan untuk membantu proses input dan validasi.


---

### 9.2 Controller

Controller bertanggung jawab mengatur proses pengolahan data.

Class ManajemenKegiatan digunakan untuk mengelola:
- Data kegiatan
- Data petugas
- Data tempat
- Proses CRUD
- Pengecekan ID
- Proteksi relasi data

Dengan penerapan MVC, tanggung jawab setiap bagian program dapat dipisahkan sehingga struktur kode menjadi lebih terorganisir dan lebih mudah dikembangkan.



---

## 10. Controller

Bagian ini berisi dokumentasi hasil eksekusi program.


---

### 10.1 Menu Utama


<img width="665" height="80" alt="image" src="https://github.com/user-attachments/assets/90aba28a-464d-4b03-8562-45a9cdb44c1f" />


Menampilkan daftar kegiatan yang telah tersimpan pada sistem.


---

### 10.2 Kelola Kegiatan - Lihat Data


<img width="673" height="356" alt="image" src="https://github.com/user-attachments/assets/69922b1a-e300-4435-95da-8c14888e106c" />

Menampilkan daftar kegiatan yang telah tersimpan pada sistem.


---

### 10.3 Kelola Kegiatan - Tambah Data


<img width="577" height="560" alt="image" src="https://github.com/user-attachments/assets/525f5f42-8bb1-451d-9014-9cfab5155b34" />


Menampilkan proses penambahan kegiatan baru dengan memasukkan data kegiatan seperti ID, nama, tanggal, jam, kategori, deskripsi, petugas, dan tempat.


---

### 10.4 Kelola Kegiatan - Ubah Data


<img width="617" height="277" alt="image" src="https://github.com/user-attachments/assets/99de389b-4085-4c35-9bab-64a87a000590" />


Menampilkan proses perubahan informasi kegiatan berdasarkan ID kegiatan.


---

### 10.5 Kelola Kegiatan - Hapus Data


<img width="688" height="180" alt="image" src="https://github.com/user-attachments/assets/f9c26109-6c63-4aed-9fe2-3b6b5fae9cc1" />


Menampilkan proses penghapusan data kegiatan berdasarkan ID.


---

### 10.6 Kelola Petugas - Lihat Data


<img width="685" height="321" alt="image" src="https://github.com/user-attachments/assets/1e2f6d29-1e05-41b2-b346-cda4c52b7475" />


Menampilkan seluruh data petugas yang tersimpan.


---

### 10.7 Kelola Petugas - Tambah Data



<img width="657" height="317" alt="image" src="https://github.com/user-attachments/assets/871f7fcb-8cad-4fd0-b043-0f79bd776ce2" />


Menampilkan proses penambahan data petugas baru.


---

### 10.8 Kelola Petugas - Ubah Data


<img width="626" height="418" alt="image" src="https://github.com/user-attachments/assets/3c5d16f7-c4b2-409e-b227-ecfc79dd2b6b" />

Menampilkan proses perubahan data petugas berdasarkan ID.


---

### 10.9 Kelola Petugas - Hapus Data


<img width="645" height="225" alt="image" src="https://github.com/user-attachments/assets/a36d09e7-5450-4a10-8ee9-7211323344c6" />


Menampilkan proses penghapusan data petugas.


---

### 10.10 Kelola Tempat - Lihat Data


<img width="677" height="327" alt="image" src="https://github.com/user-attachments/assets/1df75abd-e737-40cf-bd25-f87410e5f6c3" />


Menampilkan daftar tempat yang tersedia dan digunakan dalam kegiatan.


---

### 10.11 Kelola Tempat - Tambah Data


<img width="582" height="341" alt="image" src="https://github.com/user-attachments/assets/a50e30d2-8b70-46df-a23a-bb4fd2c70286" />


Menampilkan proses penambahan tempat baru.


---

### 10.12 Kelola Tempat - Ubah Data


<img width="590" height="466" alt="image" src="https://github.com/user-attachments/assets/3619f816-dfee-42fe-a627-0d6908f5b659" />


Menampilkan proses perubahan data tempat berdasarkan ID.


---

### 10.13 Kelola Tempat - Hapus Data


<img width="562" height="392" alt="image" src="https://github.com/user-attachments/assets/0f4cff6f-a359-4baf-9ed2-8d63bc156888" />


Menampilkan proses penghapusan data tempat berdasarkan ID.


---

### 10.14 Validasi Input

Menampilkan proses validasi ketika pengguna memasukkan data yang tidak sesuai.


<img width="461" height="316" alt="image" src="https://github.com/user-attachments/assets/f984a6de-f402-4ddb-81d0-0840d4193955" />


Contoh validasi dapat berupa ID yang sudah digunakan, ID yang tidak ditemukan, input kosong, atau kesalahan input angka.

---

### 10.15 Proteksi Relasi Petugas


<img width="652" height="256" alt="image" src="https://github.com/user-attachments/assets/1acf54a7-47f8-4206-8ff0-b1834d0021aa" />


Menampilkan kondisi ketika pengguna mencoba menghapus petugas yang masih digunakan oleh kegiatan


---

### 10.16 Proteksi Relasi Tempat


<img width="610" height="397" alt="image" src="https://github.com/user-attachments/assets/22561515-b3bc-4287-bb25-68dc9c385ac5" />


Menampilkan kondisi ketika pengguna mencoba menghapus tempat yang masih digunakan oleh kegiatan.

---

## 11. Kesimpulan

Sistem Manajemen Jadwal Kegiatan Gereja merupakan program berbasis Java yang digunakan untuk membantu pengelolaan jadwal kegiatan, data petugas, dan tempat kegiatan gereja.

Program telah menerapkan fitur CRUD pada tiga bagian utama, yaitu kegiatan, petugas, dan tempat.
Selain itu, program menerapkan konsep Pemrograman Berorientasi Objek berupa encapsulation, inheritance, abstraction, dan polymorphism.

Program juga dilengkapi dengan validasi input, dummy data, pengelolaan ArrayList, kategori kegiatan, serta proteksi terhadap penghapusan data yang masih memiliki relasi dengan kegiatan.

Penggunaan struktur MVC membuat bagian program dapat dipisahkan berdasarkan tanggung jawabnya sehingga kode menjadi lebih terstruktur dan lebih mudah dikembangkan.



