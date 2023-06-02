package javaweek3writinghwBansari;

import java.util.Scanner;

public class Programme_10_DoOperationwithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number :");
        int x = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation symbol +,  -,  *,  /    : ");
        char symbol = scanner.next().charAt(0);
        DoOperationwithSymbol(x, y, symbol);

        scanner.close();
    }
public static void DoOperationwithSymbol(int x, int y, char symbol){
    if (symbol == '+')
    {
        System.out.println(x + " + " + y + " = " + (x + y));
    } else if (symbol == '-') {
        System.out.println(x + " - " + y + " = " + (x - y));
    } else if (symbol == '*')
    {
        System.out.println(x + " x " + y + " = " + (x * y));
    } else if (symbol == '/')
    {
        System.out.println(x + " / " + y + " = " + (x / y));
    } else {
        System.out.println("please enter correct symbol +,-,*,/");
    }
}

}