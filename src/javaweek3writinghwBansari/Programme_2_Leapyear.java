package javaweek3writinghwBansari;
/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme_2_Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int year = scanner.nextInt();
        Programme_2_Leapyear leapyear =new Programme_2_Leapyear();
        leapyear.isItleapyear(year);
        scanner.close();
    }
    //Checking is it leap year or not
    public  void isItleapyear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("the year"+ year + "isItleapyear");
            return;
        }
        System.out.println("the year "+ year + "is not a leap year");
    }

}
