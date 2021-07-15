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
public class Pertemuan9 {
    public static void main(String[] args) {
        int [] arr = {10,11,12,13,14,15};
        
        //mencari nilai tertinggi
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
        
        //mencari rata2
        var sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
