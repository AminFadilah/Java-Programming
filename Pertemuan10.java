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
import java.util.Arrays;
import java.util.Scanner;
public class Pertemuan10 {
    public static void main(String[] args) {
//       int [] input = {27, 23, 21, 15, 12, 11, 10, 9, 8, 8, 5, 5, 5, 4, 4, 4, 4, 4, 3, 3};
//       var hindex = 0;
//       var iten = 0;
//        for (int i = 0; i < input.length; i++) {
//            if(input[i]>=10){
//                iten++;
//            }
//            if(input[i]>i ){
//                hindex++;
//        }
//        }
//            System.out.println(iten);
//            System.out.println(hindex);

    int [] data = {10,5,70,30,25,40};
    double [] hasil = new double[6];
    double max = data[0];
    double min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i]<min){
                min = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            hasil[i] = (data[i]-min)/(max-min);
        }
        System.out.println(Arrays.toString(hasil));
    }
    
}
