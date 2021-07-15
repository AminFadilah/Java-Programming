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
import java.util.Scanner;

public class Pertemuan1 {

    public static void main(String[] args) {
        //algoritma
//        var teh = "teh";
//        var kopi = "kopi";
//        var x = "";
//
//        x = teh;
//        teh = kopi;
//        kopi = x;
//
//        System.out.println(x);
//        System.out.println(teh);
//        System.out.println(kopi);

        //Scanner
        var in = new Scanner(System.in);
//        System.out.println("Masukan Alas : ");
//        var alas = in.nextInt();
//        System.out.println("Masukan Tinggi : ");
//        var tinggi =  in.nextInt();
//        var LuasSegitiga = (alas*tinggi)/2;
//        System.out.println(LuasSegitiga);
        //BMI : BB/TB^2
        
        //input : jumlah hari
        //output : x tahun, y bulan, z hari
        var hari = in.nextInt();
        var tahun = hari / 365;
        var sisa = hari % 365;
        var bulan = sisa / 30;
        var sisa2 =  hari % 365 % 30;
    
        System.out.println(tahun + " Tahun");
        System.out.println(bulan + " Bulan");
        System.out.println(sisa2+ " Hari");

    }
}
