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

public class TI_RegPagi_23215012_Latiha28 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Mengganti Kata=====");
        
        // Meminta input kalimat dari user
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Meminta input kata yang ingin diganti
        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine();
        
        // Meminta input kata pengganti
        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();
        
        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);
        
        // Menampilkan hasil
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
        
        scanner.close();
    }
}
