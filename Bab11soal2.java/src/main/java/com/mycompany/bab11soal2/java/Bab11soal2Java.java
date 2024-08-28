package com.mycompany.bab11soal2.java;

import java.util.Scanner;

/**
 * Program untuk menampilkan informasi karyawan berdasarkan input dari pengguna.
 */
public class Bab11soal2Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("ID Karyawan: ");
            String idKaryawan = scanner.nextLine();

            System.out.print("Nama Karyawan: ");
            String namaKaryawan = scanner.nextLine();

            System.out.print("Golongan (1-5): ");
            int gol = scanner.nextInt();
            
            String jabatan;
            double gajiPokok;
            
            switch (gol) {
                case 1:
                    jabatan = "Asisten Staff";
                    gajiPokok = 3_000_000;
                    break;
                case 2:
                    jabatan = "Staff";
                    gajiPokok = 3_500_000;
                    break;
                case 3:
                    jabatan = "Supervisor";
                    gajiPokok = 4_000_000;
                    break;
                case 4:
                    jabatan = "Asisten Manager";
                    gajiPokok = 5_000_000;
                    break;
                case 5:
                    jabatan = "Manager";
                    gajiPokok = 6_000_000;
                    break;
                default:
                    jabatan = "Tidak valid";
                    gajiPokok = 0;
                    break;
            }

            // Menampilkan hasil
            System.out.println("ID Karyawan: " + idKaryawan);
            System.out.println("Nama Karyawan: " + namaKaryawan);
            System.out.println("Golongan: " + gol);
            System.out.println("Jabatan: " + jabatan);
            // Format gajiPokok dengan pemisah ribuan
            System.out.printf("Gaji Pokok: Rp %, .2f%n", gajiPokok);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan masukkan data yang benar.");
        } finally {
            scanner.close(); // Menutup scanner
        }
    }
}
