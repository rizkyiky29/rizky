package com.mycompany.bab14soal.java;

/**
 * Program untuk mendemonstrasikan penggunaan kelas abstrak
 * 
 * @author Rizki
 */
public class Bab14soalJava {

    // Kelas abstrak AbstrakHewan
    abstract static class AbstrakHewan {
        // Method abstract
        public abstract void suara();

        // Method non-abstract
        public void suara2() {
            System.out.println("Ini method konkrit dari parent class");
        }
    }

    // Subclass Kucing yang mengimplementasikan kelas AbstrakHewan
    static class Kucing extends AbstrakHewan {
        @Override
        public void suara() {
            System.out.println("Kucing bersuara: Meong Meong");
        }
    }

    // Subclass Anjing yang mengimplementasikan kelas AbstrakHewan
    static class Anjing extends AbstrakHewan {
        @Override
        public void suara() {
            System.out.println("Anjing bersuara: Guk Guk");
        }
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Kucing
        AbstrakHewan kucing = new Kucing();
        kucing.suara(); // Panggil method abstract yang diimplementasikan
        kucing.suara2(); // Panggil method konkrit dari parent class

        // Membuat objek Anjing
        AbstrakHewan anjing = new Anjing();
        anjing.suara(); // Panggil method abstract yang diimplementasikan
        anjing.suara2(); // Panggil method konkrit dari parent class
    }
}
