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

public class Pertemuan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Menjumlahkan angka 1-param
//        var param = sc.nextInt();
//        var count = 0;
//        var hasil = 0;
//        while(++count<=param){
//            hasil+=count;
//        }
//            System.out.println(hasil);

//        Tebak perkalian menggunakan while
//        int angka = (int) (Math.random() * 10);
//        int angka2 = (int) (Math.random() * 10);
//        int answer = angka * angka2;
//        var hasil = 0;
//        System.out.println("berapakah "+angka+" * "+angka2+ "?");
//          hasil = sc.nextInt();
//        
//         while(hasil != angka*angka2){
//             System.out.println("maaf,jawaban anda salah!");
//             System.out.println("barapakah "+angka+" * "+angka2+ "?");
//             hasil = sc.nextInt();
//        }System.out.println("selamat jawaban anda benar");
//        Tebak Perkalian menggunakan do while
//        do {
//            System.out.println("barapakah " + angka + " * " + angka2 + "?");
//            hasil= sc.nextInt();
//    }while (answer != hasil);
//        System.out.println("selamat jawaban anda benar");
        //tebak angka 1-100
//        int a = (int) (Math.random() * 100);
//        int b = 0;
//        int jumlah = 0;
//        while (b != a) {
//            System.out.print("Ayo Tebak!! ");
//            b = sc.nextInt();
//            jumlah++;
//            if (b > a) {
//                System.out.println("jawaban anda terlalu tinngi");
//            } else {
//                System.out.println("jawaban anda terlalu rendah");
//            }
//        }
//        System.out.println("Selamat");
//        System.out.println("Anda menebak " + jumlah + " kali");
        //mencari FPB & bilangan prima
//        System.out.println("Insert number 1");
//        var a = sc.nextInt();
//        System.out.println("Insert number 2");
//        var b = sc.nextInt();
//        fpb(a, b);

        var bilangan = sc.nextInt();
        int count = 2;
        boolean prima = true;
        while (count < (bilangan/2)) {
            if (bilangan % count == 0) {
                prima = false;
            }
            count++;
        }
        System.out.println(bilangan);
        System.out.println(prima ? "prima" : "bukan prima");
    }
//
//    public static void fpb(int x, int y) {
//        int max;
//        int min;
//        if (x > y) {
//            max = x;
//            min = y;
//        } else {
//            max = y;
//            min = x;
//        }
//        var count = min;
//        while (count > 0) {
//            if (max % count == 0 && min % count == 0) {
//                var fpb = count;
//                System.out.println("fpb: " + fpb);
//                break;
//            }
//            count--;
//        }
//
//    }

}
