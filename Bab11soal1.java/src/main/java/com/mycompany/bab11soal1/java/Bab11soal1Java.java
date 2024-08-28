package com.mycompany.bab11soal1.java;

/**
 * Program untuk menampilkan informasi karyawan
 */
public class Bab11soal1Java {

    public static void main(String[] args) {
        // Membuat objek karyawan
        Karyawan karyawan1 = new Karyawan("K001", "Rizki", "Golongan 1", "Manajer", 5000000);
        Karyawan karyawan2 = new Karyawan("K002", "Ayu", "Golongan 2", "Asisten", 3000000);

        // Menampilkan informasi karyawan
        System.out.println("Informasi Karyawan 1:");
        karyawan1.tampilkanInfo();

        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.tampilkanInfo();
    }
}

/**
 * Class untuk menyimpan data karyawan.
 */
class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;

    // Constructor dengan parameter
    public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }
    
    // Metode untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
