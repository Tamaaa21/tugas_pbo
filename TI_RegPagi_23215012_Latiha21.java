/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author AXIOO
 */
import java.util.Scanner;

public class TI_RegPagi_23215012_Latiha21 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        // Inisialisasi variabel untuk menyimpan total nilai
        double totalNilai = 0;
        
        // Loop untuk meminta nilai tiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }
        
        // Menghitung rata-rata nilai
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // Menampilkan hasil
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by: Nama Anda");  // Ganti dengan nama Anda
        
        scanner.close();
    }

}
