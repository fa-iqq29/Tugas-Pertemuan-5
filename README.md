# Tugas Pertemuan 5

## Deskripsi Penerapan Exception
Class PenerapanException sebagai implementasi custom exception handling untuk mencontohkan bagaimana Java menangani error khusus (contoh kasus: saldo tidak cukup saat transaksi).

## Deskripsi GUI Database
Aplikasi Java Swing CRUD sederhana untuk manajemen data *Mata Kuliah*. Database yang digunakan adalah PostgreSQL. Pengguna dapat menambah, mengubah, menghapus, dan melihat data mata kuliah melalui antarmuka grafis.

## Fitur  
- Tampilkan data mata kuliah di tabel (JTable).  
- Tambah data baru (Insert).  
- Pilih baris di tabel untuk mengisi form secara otomatis.  
- Perbarui data berdasarkan data lama sebagai kondisi (WHERE).  
- Validasi sederhana agar semua field wajib diisi.  
- Kosongkan form setelah tindakan (Simpan / Update).

## Struktur Project  
- Class GUI yang mengatur tampilan form, tabel, dan tombol aksi (Simpan, Update, Hapus, Bersih).  
- Koneksi ke database menggunakan JDBC.  
- Statement / PreparedStatement untuk query SQL (SELECT, INSERT, UPDATE, DELETE).  

## Prasyarat  
- Java (versi minimal yang mendukung `var`, jika digunakan).  
- PostgreSQL terinstal & berjalan.  
- Tabel database (`mata_kuliah`) dengan kolom seperti `kode`, `nama`, `matkul_semester` (tipe integer), `dosen_pengajar`.  
- Driver PostgreSQL (JDBC) ditambahkan ke _classpath_ / library project.  

## Cara Menggunakan  

1. Clone repository:
   ```bash
   git clone https://github.com/fa-iqq29/Tugas-Pertemuan-5.git

2. Konfigurasi database di kode:

   Ubah URL, user, dan password sesuai pengaturan lokalmu.
   
3. Jalankan aplikasi:

   Jalankan class utama (GUI JFrame). Aplikasi akan membuka form, menghubungkan ke database, dan memuat data dari tabel.

4. Menambah data:

   Isi semua field, lalu klik tombol Simpan.

5. Memperbarui data:

   - Klik salah satu baris di JTable → ini akan mengisi field form.

   - Ubah data di field yang ingin diupdate.

   - Klik tombol Update.

6. Menghapus data:
   
   (Jika fitur Hapus sudah ada) → Pilih baris → klik tombol Hapus.
