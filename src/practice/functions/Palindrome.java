package practice.functions;

import java.util.Scanner;

public class Palindrome {
    static String reverseString(String str){
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    static boolean palindromeStr(String str){
        return str.equalsIgnoreCase(reverseString(str));
    }

    static int reverseNumber(int num){
        int rev = 0;
        while(num>0){
            rev = ((rev*10) + (num%10));
            num /= 10;
        }
        return rev;
    }

    static boolean palindromeNum(int num){
        return (num == reverseNumber(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(palindromeStr(str)){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It is not a palindrome.");
        }

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(palindromeNum(num)){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It is not a palindrome.");
        }
    }
}
