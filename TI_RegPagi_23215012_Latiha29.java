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

public class TI_RegPagi_23215012_Latiha29 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display color choices
        System.out.println("PILIH WARNA FAVORITMU:");
        System.out.println("1. MERAH");
        System.out.println("2. HIJAU");
        System.out.println("3. KUNING");
        System.out.println("4. BIRU");
        System.out.println("5. UNGU");
        
        System.out.print("PILIH WARNA FAVORITMU (ketik nama warna): ");
        String color = scanner.next().toUpperCase();
        
        // Output personality traits based on color
        System.out.println("\nWARNA FAVORITMU: " + color);
        
        switch (color) {
            case "MERAH":
                System.out.println("1. Periang");
                System.out.println("2. Berani mengambil risiko");
                System.out.println("3. Senang petualangan");
                break;
            case "HIJAU":
                System.out.println("1. Penyabar");
                System.out.println("2. Tenang dan damai");
                System.out.println("3. Menjaga emosi");
                break;
            case "KUNING":
                System.out.println("1. Optimis");
                System.out.println("2. Ceria");
                System.out.println("3. Menyukai tantangan");
                break;
            case "BIRU":
                System.out.println("1. Setia");
                System.out.println("2. Tenang dan dapat dipercaya");
                System.out.println("3. Selalu ada untuk sahabat");
                break;
            case "UNGU":
                System.out.println("1. Misterius");
                System.out.println("2. Anggun");
                System.out.println("3. Kreatif");
                break;
            default:
                System.out.println("Warna tidak terdeteksi.");
                break;
        }
        
        scanner.close();
    }


}
