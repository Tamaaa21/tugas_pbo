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

    import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TI_RegPagi_23215012_Latiha26 {
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        LocalDateTime sekarang = LocalDateTime.now();
        
        // Format waktu dalam pola yang diinginkan
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String waktu = sekarang.format(formatter);
        
        System.out.println("Hari ini adalah hari : " + waktu);
    }

}
