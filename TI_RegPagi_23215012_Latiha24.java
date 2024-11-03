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
public class TI_RegPagi_23215012_Latiha24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            // Menerima input dua nilai dari pengguna
            System.out.println("======Program Perbandingan Nilai======");
            System.out.print("Masukkan nilai pertama : ");
            int nilai1 = input.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            int nilai2 = input.nextInt();

            // Melakukan perbandingan
            if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            }

            // Menanyakan kepada pengguna apakah ingin mengulangi
            System.out.print("Ulangi Aktivitas? (Ya/Tidak) : ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
        input.close();
    }
}
