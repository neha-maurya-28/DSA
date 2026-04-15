package practice.functions;

import java.util.Scanner;

public class RomanToNumeric {
    static int value(char c){
        if(c == 'I')return 1;
        if(c == 'V')return 5;
        if(c == 'X')return 10;
        if(c == 'L')return 50;
        if(c == 'C')return 100;
        if(c == 'D')return 500;
        if(c == 'M')return 1000;
        return 0;
    }

    static int changeToNumber(String roman){
        int len = roman.length();
        int curr = 0;
        for(int i = 1; i<len; i++){
            curr = value(roman.charAt(i-1));
            int next = value(roman.charAt(i));
            if(curr >= next){
                curr += next;
            }else{
                curr -= next;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roman number: ");
        String roman = sc.nextLine();
        System.out.println("Numeric value: " + changeToNumber(roman));
    }
}
