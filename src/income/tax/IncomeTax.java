/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package income.tax;
import java.util.Scanner;
/**
 *
 * @author besad0473
 */
public class IncomeTax {
    Scanner keyedInput = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double first = 0.15;
        final double second = 0.205;
        final double third = 0.26;
        final double forth = 0.29;
        final double last = 0.33;
        double income;
        double tax;
         Scanner keyedInput = new Scanner (System.in);
        System.out.println("Enter your income");
        income = keyedInput.nextInt();
        
      tax = income*first;
       System.out.println("You will need to play $"+ income);
        
    }
    
}
