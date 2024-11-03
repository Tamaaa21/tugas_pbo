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

public class TI_RegPagi_23215012_Latiha30 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kamu ngerjain sendiri latihan 27 sampai latihan 30 ini?");
        System.out.print("Jawab (Yoi/Enggak): ");
        String answer = scanner.next();
        
        if (answer.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep bener. Good Job!");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsepnya yee.");
            System.out.println("Keep the code works dude");
        }
        
        scanner.close();
    }
}

