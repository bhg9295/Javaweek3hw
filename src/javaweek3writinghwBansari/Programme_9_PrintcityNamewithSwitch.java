package javaweek3writinghwBansari;

import java.util.Scanner;

public class Programme_9_PrintcityNamewithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleasr enter alphabet between A to F :");
        String city = scanner.next().toUpperCase();

        // create object call instance method
        Programme_9_PrintcityNamewithSwitch cityname = new Programme_9_PrintcityNamewithSwitch();
        cityname.printCityname(city);
        scanner.close();
    }

    public void printCityname(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
            case "C":
                System.out.println("Cambridge");
            case "D":
                System.out.println("Derby");
            case "E":
                System.out.println("Edinburg");
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}