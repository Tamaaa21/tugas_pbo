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

public class TI_RegPagi_23215012_Latiha17 {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input gaji pokok
        System.out.print("Berapa gaji pokok anda per bulan?: Rp ");
        double gajiPokok = input.nextDouble();

        // Meminta input status perkawinan
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();

        // Menentukan besarnya tunjangan berdasarkan status perkawinan
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("\n=== Hasil Perhitungan Gaji Anda ===");
        System.out.println("Gaji Pokok        : Rp " + gajiPokok);
        System.out.println("Tunjangan         : Rp " + tunjangan);
        System.out.println("Total Gaji        : Rp " + totalGaji);
        System.out.println("(Developed by: Nama Anda)");
        
        // Menutup scanner
        input.close();
    }
}
