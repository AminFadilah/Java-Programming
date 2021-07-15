/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramandasarsa;

/**
 *
 * @author asus
 */
import java.time.LocalDateTime;
import java.util.Scanner;
public class Pertemuan3 {

    public static void main(String[] args) {
//        var a = 10;
//        var b = 10;
//        
//        if (a==100 && b++ ==10) {
//            
//        }
//        System.out.println(b);  


        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int tanggal = now.getDayOfMonth();
//        int tanggal = 5;
//        String bulan = now.getMonth().name();
//        if (tanggal >= 1 && tanggal <= 10) {
//            System.out.println("hari ini tanggal " + tanggal + " " + bulan + " makanan yang ditawarkan adalah pizza");
//        } else if (tanggal >= 11 && tanggal <= 20) {
//            System.out.println("hari ini adalah tanggal " + tanggal + " " + bulan + " menu yang ditawarkan adalah Nasi padang");
//        } else {
//            System.out.println("hari ini adalah tanggal " + tanggal + " " + bulan + " menu yang ditawarkan adalah indomie");
//
//        }

         
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jarak: ");
        var jarak = sc.nextDouble();
        var tarif = 3000;
        var tarif2 = 2500;
        var tarif3 = 3500;
        int total;
        if (hour >= 21 && hour <= 6) {
            total = (int)(tarif3 * jarak) + tarif;
            System.out.printf("Rp %,3d\n", total);
        } else {
            total = (int)(tarif2 * jarak) + tarif;
            System.out.printf("Rp %,3d\n", total);
        }
    }

}
