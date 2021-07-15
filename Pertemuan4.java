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
public class Pertemuan4 {
    public static void main(String[] args) {
      var now = LocalDateTime.now();
      var day = now.getDayOfWeek().getValue();
//        System.out.println(day);
      switch(day){
          case 0:
              System.out.println("Minggu");
              break;
          case 1:
              System.out.println("Senin");
              break;
          case 2:
              System.out.println("Selasa");
              break;
          case 3:
              System.out.println("Rabu");
              break;
          case 4:
              System.out.println("Kamis");
              break;
          case 5:
              System.out.println("Jumat");
              break;
          default:
              System.out.println("Sabtu");
          
      }
    }
    
}
