# LATIHAN5DPBO2023

Penjelasan hasil program:<br>
<br>
   Pada tugas ini adalah membuat form yang terdiri dari 3 Textfield (NIM, Nama, Nilai) dan 1 lagi bebas, saya menggunakan dropdown (Program Studi), lalu ada tombol-tombol yaitu tombol add, delete, cancel, dan update, tombol yang sama dengan tombol add, dan terakhir hasil dari form tersebut ditampilkan di tabel. Saya membuat 2 class yaitu MainJFrame.java untuk mengurus tampilan depan dari program dan Student.java yang digunakan untuk template dan juga tempat penampung sementara untuk data inputan yang nantinya akan diteruskan untuk dimasukkan ke tabel menggunakan setter dan getter dari class Student.java. <br>
    <br>
  Tampilan utama program adalah sebagai berikut, <br>
  ![image](https://user-images.githubusercontent.com/99600360/226894851-f33bfbe6-c305-4d99-a85e-2924cccc9ca1.png) <br>
	<br>
	Penjelasan atribut form:<br>
	1. Pertama field untuk user bisa mengisi form, yaitu ada 3 Textfield yang terdiri dari NIM, Nama, dan Nilai serta 1 Dropdown yaitu Program Studi. <br>
  2. Selanjutnya ada tabel, tabel digunakan untuk menampilkan inputan dari user. <br>
  3. Terakhir ada tombol-tombol yaitu tombol add untuk menambahkan data, delete untuk menghapus data, cancel apabila tidak jadi mengisi form, dan update (tombol yang          sama dengan tombol add) untuk mengubah data. <br>
  <br>
  Penjelasan fitur-fitur:<br>
  1. Menambahkan data<br>
     Untuk menambahkan data user cukup mengisi form, kemudian mengklik tombol add, dan nantinya inputan user akan muncul di tabel dan panel dialog pemberitahuan akan        muncul. contoh gambar ada di bawah, <br>
     ![image](https://user-images.githubusercontent.com/99600360/226901095-2a6b123d-958d-4518-8857-bf734b97f914.png) <br>
     ![image](https://user-images.githubusercontent.com/99600360/226901401-c3f79696-4f34-47fe-8b7c-ae760d36bc43.png) <br>
     Jika ika dilihat pada console di bawah terdapat tulisan "cancel success," hal tersebut dikarenakan output tersebut saya simpan di prosedur resetForm. <br>
  2. Memilih data di tabel<br>
     Untuk mengedit/hapus data kita perlu memilih data mana yang akan dieksekusi dengan cara memilih dalam tabel, caranya adalah dengan mengeklik data yang akan kita        eksekusi pada tabel. Jika kita sudah memilih data maka tombol delete akan terlihat dan tombol add akan berubah menjadi tombol update<br>
     Note: data yang sudah dipilih adalah baris yg berwarna biru di tabel<br>
     ![image](https://user-images.githubusercontent.com/99600360/226938268-9174d6b4-b62e-4176-8851-475812e4b8b3.png) <br>
  3. Menghapus data<br>
     Untuk menghapus data cukup dengan memilih data seperti yang sudah dijelaskan di nomor 2 dan tombol delete akan muncul, kemudian klik tombol delete, setelah itu        akan ada dialog konfirmasi,
     ![image](https://user-images.githubusercontent.com/99600360/226940897-ae6150ec-ebd0-4cda-b141-6138f6b56178.png) <br>
     jika kita jika memilih no data tidak akan dihapus dan jika memilih yes maka data akan terhapus
     ![image](https://user-images.githubusercontent.com/99600360/226941180-3db31adc-b4d9-46a2-a9c0-540c83945f82.png) <br>
     ![image](https://user-images.githubusercontent.com/99600360/226941596-5df03501-368e-419c-81a1-9d8683ace3da.png) <br>
  5. Tidak jadi mengisi form<br>
     Jika tombol cancel ditekan maka form otomatis akan terhapus, hal tersebut juga berlaku apabila tidak jadi ingin add/update data.<br>
     Note: proses cancel bisa dilihat pada console di bawah
     ![image](https://user-images.githubusercontent.com/99600360/226942810-43ab1b2b-5ae9-4715-af64-bbd35f3a6542.png) <br>
     ![image](https://user-images.githubusercontent.com/99600360/226943153-8cc432e3-0865-45b4-85e5-f6e67b992b51.png) <br>
  7. Update data<br>
     Tombol update akan muncul menggantikan tombol add jika sudah memilih data sesuai dengan yang sudah dijelaskan di nomor 2. Gambar di bawah akan ditunjukkan saat        ingin mengubah NIM dari jackson, bisa dilihat juga pada console di bawah bahwa data berhasil diubah beserta dengan kotak dialg yang muncul <br>
     ![image](https://user-images.githubusercontent.com/99600360/226944481-28908b86-e3bc-45a7-bc1a-cda80100a07b.png) <br>
     ![image](https://user-images.githubusercontent.com/99600360/226944805-d798b58d-061a-4401-b486-b02edd21fb1f.png) <br>


  
