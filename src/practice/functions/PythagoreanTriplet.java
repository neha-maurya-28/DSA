package practice.functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    static void checkPythagoreanTriplet(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        int check = 0;
        if(max == a){
            check = ((b*b)+(c*c));
        }
        else if(max == b){
            check = ((a*a)+(c*c));
        }else{
            check = ((b*b)+(a*a));
        }
        if(check == (max*max)){
            System.out.println("It is a pythagorean triplet.");
        }else{
            System.out.println("It is not a pythagorean triplet.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        checkPythagoreanTriplet(num1, num2, num3);
    }
}
