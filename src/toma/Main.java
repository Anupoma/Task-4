/*
Name   : Anupoma Angasree Toma
ID     : 2012020060
Section: B
Email  : cse_2012020060@lus.ac.bd
Date   : 16-10-2021
 */

package toma;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvancedArithmetic advancedArithmetic = new MyCalculator();
        
        System.out.println("Enter a number to find the divisor of sum: ");
        int num1 = sc.nextInt();
        advancedArithmetic.divisorSum(num1);
        
        System.out.println("Enter a number to find the factorial: ");
        int num2 = sc.nextInt();
        advancedArithmetic.findFactorial(num2);
    }
}
