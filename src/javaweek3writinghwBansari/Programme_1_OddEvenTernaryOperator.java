package javaweek3writinghwBansari;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println(" please enter the number ");
         int number = scanner.nextInt();
         isItoddorEvenNumber(number);
         // closung the scanner object
         scanner.close();
     }
//Cheking the number is even or odd
public static void isItoddorEvenNumber(int number){
         // ternary operatore is used
    String evenoradd = (number % 2 == 0) ? "EVEN" : "ODD";
    System.out.println("The"+number + "is"+ evenoradd +"number");

}
}
