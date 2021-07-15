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
public class Pertemuan15 {
    public static void main(String[] args) {
        double [][] data = {{2,1},{2,2},{3,2},{4,1},{3,4},{5,3}};
        char [] id = {'A','B','C','D','E','F'};
        double [] x={6,4};
        double min = data [0][0];
        char c = 0;
        for (int i = 0; i < data.length; i++) {
            double dx = data[i][0] - x[0];
            double dy = data [i][1]- x[1];
            double d = Math.sqrt(Math.pow(dx, 2)+ Math.pow(dy, 2));
            if (d< min){
                min = d;
                c = id[i];
            }
        }
        System.out.println(c);
        System.out.println(min);
    }
}
