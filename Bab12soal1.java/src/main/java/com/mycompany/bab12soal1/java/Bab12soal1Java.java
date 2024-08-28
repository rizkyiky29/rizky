package com.mycompany.bab12soal1.java;

/**
 * Program untuk menghitung gaji total dari seorang System Analyst.
 */
public class Bab12soal1Java {

    public static void main(String[] args) {
        // Membuat objek SystemAnalyst
        SystemAnalyst systemAnalyst = new SystemAnalyst("Rizki", 400000, 100000, 40000, 50000);
        double gajiTotal = systemAnalyst.hitungGajiTotal();

        // Menampilkan informasi gaji
        System.out.println("Nama: " + systemAnalyst.nama);
        System.out.println("Gaji Pokok: " + systemAnalyst.gaji);
        System.out.println("Bonus: " + systemAnalyst.bonus);
        System.out.println("Tunjangan Makan: " + systemAnalyst.tunjanganMakan);
        System.out.println("Transport: " + systemAnalyst.transport);
        System.out.println("Gaji Total: " + gajiTotal);
    }
}

class Karyawan {
    String nama;
    double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
}

class SystemAnalyst extends Karyawan {
    double bonus;
    double tunjanganMakan;
    double transport;

    public SystemAnalyst(String nama, double gaji, double bonus, double tunjanganMakan, double transport) {
        super(nama, gaji);
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }
    
    public double hitungGajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }
}
