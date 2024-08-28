package com.mycompany.bab6soal1.java;

import java.util.Scanner; // Import Scanner class

public class Bab6soal1Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("NIM ? : ");
        int NIM = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("NAMA ? : ");
        String Nama = input.nextLine();

        System.out.print("NILAI ? : ");
        int Nilai = input.nextInt();

        // Menentukan grade berdasarkan nilai
        char grade;
        if (Nilai >= 85) {
            grade = 'A';
        } else if (Nilai >= 70) {
            grade = 'B';
        } else if (Nilai >= 55) {
            grade = 'C';
        } else if (Nilai >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("NILAI : " + Nilai);
        System.out.println("GRADE : " + grade);

        input.close();
    }
}
