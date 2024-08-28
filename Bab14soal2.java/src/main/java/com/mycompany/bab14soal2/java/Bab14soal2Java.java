package com.mycompany.bab14soal2.java;

/**
 * Program untuk mendemonstrasikan penggunaan kelas abstrak dan subclass
 * 
 * @author Rizki
 */
public class Bab14soal2Java {

    // Kelas abstrak
    abstract static class AbstrakHewan {
        public abstract void suara();

        public void suara2() {
            System.out.println("Ini method konkrit dari parent class");
        }
    }

    // Subclass Kucing
    static class Kucing extends AbstrakHewan {
        @Override
        public void suara() {
            System.out.println("Meow");
        }
    }

    // Subclass Anjing
    static class Anjing extends AbstrakHewan {
        @Override
        public void suara() {
            System.out.println("Woof");
        }
    }

    // Subclass Burung
    static class Burung extends AbstrakHewan {
        @Override
        public void suara() {
            System.out.println("Mencicit");
        }
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        AbstrakHewan burung = new Burung();
        
        // Memanggil metode dari objek Burung
        System.out.print("Suara Burung: ");
        burung.suara();  // Output: Mencicit
    }
}
