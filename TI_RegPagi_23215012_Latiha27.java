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

public class TI_RegPagi_23215012_Latiha27 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input kalimat
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Menampilkan kalimat dalam huruf besar dan kecil
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        scanner.close();
    }

}
