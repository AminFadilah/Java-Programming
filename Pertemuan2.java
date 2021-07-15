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
public class Pertemuan2 {

    public static void main(String[] args) {
// casting
//   penulisan literal integer untuk binary
        int bin = (int) 0b1111;
//   penulisan literal integer untuk octal
        int oct = 07777;
//   penulisan literal integer untuk heksadesimal
        int hex = 0xFFFF;
//        System.out.println(bin);
//        System.out.println(oct);

//Menentukan hari pulang dengan input hari pergi dan lama pergi
        Scanner input = new Scanner(System.in);
//        System.out.print("hari keberangkatan: ");
//        int hari = input.nextInt();
//        System.out.print("berapa hari pergi: ");
//        int lama = input.nextInt();
//        int pulang = (hari + lama) % 7;
//        System.out.print("pulang ke rumah: " + pulang);

//	Modulus angka tanpa menggunakan tanda %
          var angka = 20;
          var angka2 = 6;
          
          var modulus = angka-angka/angka2*angka2;
          
          System.out.println(modulus);
          
    }
}
