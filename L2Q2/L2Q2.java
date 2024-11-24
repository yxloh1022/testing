/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;
import java.util.Scanner;

/**
 *
 * @author YX LOH
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner keyboard = new Scanner (System.in);
      double P,D,R,Y;
      System.out.println("Enter price of car");
      P = keyboard.nextDouble();
      System.out.println("Enter down payment");
      D = keyboard.nextDouble();
      System.out.println("Enter interest rate in %");
      R = keyboard.nextDouble();
      System.out.println("Enter loan period in years");
      Y = keyboard.nextDouble();
      double M = (P-D)*(1+R*Y/100)/(Y*12);
      System.out.printf("Monthly Payment = " + "%.2f",M);
             
      
    }
}
                  
      
       
             
     
      


    
    

