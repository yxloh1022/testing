/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;
import java.util.Random;
/**
 *
 * @author YX LOH
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Double n1, n2, n3;
        int min= 10;
        int max= 51;
        
        n1 = r.nextDouble(min,max);
        n2 = r.nextDouble(min,max);
        n3 = r.nextDouble(min,max);
        
        Double Sum= n1 + n2 + n3;
        Double Average = (Sum)/3;
        System.out.println("number 1= " + n1);
        System.out.println("number 2= " + n2);
        System.out.println("number 3= " + n3);
        System.out.println("Sum of numbers = " + Sum);
        System.out.printf("Average of numbers = " + "%.2f",Average);
              
        
       
        
    }
    
}
