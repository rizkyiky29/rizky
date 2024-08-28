package com.mycompany.bab13soal2.java;

/**
 * Program untuk menghitung luas segitiga
 * 
 * @author Rizki
 */
public class Bab13soal2Java {

    // Kelas Segitiga sebagai kelas bersarang statis
    public static class Segitiga {
        private double alas;
        private double tinggi;
        private double luas;

        // Konstruktor dengan parameter
        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.luas = hitungLuas();
        }

        // Metode untuk menghitung luas segitiga
        private double hitungLuas() {
            return (alas * tinggi) / 2;
        }

        // Getter untuk alas
        public double getAlas() {
            return alas;
        }

        // Getter untuk tinggi
        public double getTinggi() {
            return tinggi;
        }

        // Getter untuk luas
        public double getLuas() {
            return luas;
        }
    }
    
    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Segitiga dengan alas dan tinggi
        Segitiga segitiga = new Segitiga(10, 5);

        // Menampilkan hasil perhitungan
        System.out.println("Alas: " + segitiga.getAlas());
        System.out.println("Tinggi: " + segitiga.getTinggi());
        System.out.println("Luas: " + segitiga.getLuas());
    }
}
