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

public class Pertemuan6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Menentukan bilangan prima/bukan
        var input = in.nextInt();
        boolean prima = true;
        for (int i = 2; i <Math.sqrt(input); i++) {
            if (input % i == 0) {
                prima = false;
                break;
            }

        }
        System.out.println(prima ? "prima" : "bukan prima");
        
//        Menjumlahkan angka
//        var angka = in.nextInt();
//        var sum =0;
//        for (int i = 0; i < 4; i++) {
//            sum += angka%10;
//            angka/= 10;
//        }
//        System.out.println(sum);

        // membalik angka
//        var angka = in.nextInt();
//        int angkaTerbalik = 0;
//        for (int i = 0; i < 4; i++) {
//            angkaTerbalik = angka % 10;
//            angka /= 10;
//            System.out.print(angkaTerbalik);
//        }
//            System.out.println();
    }
}
