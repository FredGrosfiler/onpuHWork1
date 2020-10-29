package com.grosfiler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Choose task: ");
        i = scanner.nextInt();

        switch (i) {
            case 1: power();
                break;
            case 2: squareRoot();
                break;
            case 3: quadratic();
                break;
        }
    }

    private static void power() {

        Scanner scanner = new Scanner(System.in);

        double number;
        int pow;

        double answer = 1;

        System.out.println("Enter number: ");
        number = scanner.nextDouble();

        System.out.println("Enter power: ");
        pow = scanner.nextInt();


        for (int i = 0; i < pow; i++){
            answer = answer * number;
        }

        System.out.println("Number " + number + " in power " + pow + " is " + answer);
    }

    private static void squareRoot() {

        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.println("Enter number: ");
        number = scanner.nextInt();

        double answer = Math.sqrt(number);

        System.out.println("Square root of " + number + " is " + answer);
    }

    private static void quadratic() {

        Scanner scanner = new Scanner(System.in);

        double aArg, bArg, cArg;

        System.out.println("Enter arguments a, b and c : ");
        aArg = scanner.nextDouble();
        bArg = scanner.nextDouble();
        cArg = scanner.nextDouble();

        double disc = (bArg* bArg) - (4 * aArg * cArg);

        if (disc > 0){
            double x1 = (-bArg + Math.sqrt(disc)) / (2*aArg);
            double x2 = (-bArg - Math.sqrt(disc)) / (2*aArg);
            System.out.println("Square roots are: " + x1 + " and " + x2);
        } else if (disc == 0) {
            double x = (-bArg)/(2*aArg);
            System.out.println("Square root is " + x);
        } else {
            System.out.println("No roots");
        }


    }
}
