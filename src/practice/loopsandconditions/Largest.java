package practice.loopsandconditions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //Largest among the three numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = sc.nextInt();
        System.out.print("Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Third number: ");
        int num3 = sc.nextInt();

//        int max = num1;
//        if (num2 > max) {
//            max = num2;
//        }
//        if (num3 > max) {
//            max = num3;
//        }

        int max = Math.max(Math.max(num1, num2), num3);

        System.out.println("Largest number is " + max);
    }
}
