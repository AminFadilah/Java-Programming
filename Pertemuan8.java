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
public class Pertemuan8 {
    public static void main(String[] args) {
        var input2 = 0d;
        String input = "12345";
        var cek = 0.0;
        input2 = Integer.valueOf(input);
        for (int i = 0; i < input.length(); i++) {
           cek += input2 % 10;
           input2 /=10;
        }
        System.out.println(cek/input.length());
    }
}
