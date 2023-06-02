package javaweek3writinghwBansari;

import java.util.Scanner;

// /**
// * Write a program that tells us input value is number or an alphabet or symbol.
// */
public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 :");
        char ch = scanner.next().charAt(0);
        // object creation
        int day = scanner.nextInt();
        findTheDaysName(day);
        scanner.close();
    }
    // find the name of the day
    public static void findTheDaysName(int day){
        switch (day){
            case  1:
                System.out.println("Its monday");
                break;
            case 2:
                System.out.println("its tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thuresday");
                break;
                case 5:
                System.out.println("Its Friday");
                break;
                case 6:
                System.out.println("Its Saturday");
                break;
                case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("week to 7 days");
                break;
        }
    }
}
