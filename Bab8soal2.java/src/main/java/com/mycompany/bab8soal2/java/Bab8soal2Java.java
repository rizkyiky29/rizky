/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2.java;

/**
 *
 * @author  Rizki
 */
public class Bab8soal2Java {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Meminta input tahun akhir dan tahun awal
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();
  // Validasi input
        if (tahunAwal > tahunAkhir) {
            System.out.println("Tahun Awal harus lebih kecil atau sama dengan Tahun Akhir.");
        } else {
            // Pengulangan for untuk menampilkan tahun dari tahun akhir ke tahun awal
            for (int i = tahunAkhir; i >= tahunAwal; i--) {
                System.out.println(i);
                 }
        }

        scanner.close();
    }
}
    

