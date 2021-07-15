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
import java.util.*;

public class Pertemuan7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        var number = in.nextInt();
//        int faktorial = 1;
//        for (int i = 2; i <= number; i++) {
//            faktorial *= i;
//        }
//        System.out.println(faktorial);

//        var angka = in.nextInt();
////        var fak = angka;
//        for (int i = angka-1; i > 0; i--) {
//            angka*=i;
//        }
//        System.out.println(angka);
        var hasil = 1;
        var angka = in.nextInt(); 
        System.out.print("MASUKAN PANGKAT = ");
        var pangkat = in.nextInt();  
        for (int i = 1; i <= pangkat; i++) { 
            hasil  *= angka;
        }
        System.out.print(hasil);
    }
}
