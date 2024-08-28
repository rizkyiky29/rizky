/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal2.java;

import java.util.Scanner;//import statement untuk Scanner

/**
 *
 * @author Rizki
 */
public class Bab6soal2Java {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input NIM
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        // Input Nama
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        // Input Nilai
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
// Menentukan Grade dan Keterangan
        String grade;
        String keterangan;

        if (nilai >= 85 && nilai <= 100) {
            grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 75 && nilai < 85) {
            grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 65 && nilai < 75) {
            grade = "C";
            keterangan = "Lulus";
        } else if (nilai >= 50 && nilai < 65) {
            grade = "D";
            keterangan = "Tidak Lulus";
        } else {
            grade = "E";
            keterangan = "Tidak Lulus";
        }

        // Output
        System.out.println("Output:");
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);

        // Menutup scanner
         scanner.close();
    }
}