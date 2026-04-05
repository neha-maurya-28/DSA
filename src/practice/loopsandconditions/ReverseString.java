package practice.loopsandconditions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        //using string builder
//        StringBuilder rev = new StringBuilder(str).reverse();

        //using loop
        int len = str.length();
        String rev = "";
//        for(int i=len-1; i>=0; i--){
//            rev += str.charAt(i);
//        }


        //Using char array
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
