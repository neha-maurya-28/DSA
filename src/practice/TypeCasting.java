package practice;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");

//        float num1 = 24.90f;
//        int num2 = 500;
//
//        float num3 = num2;
////        int num4 = num1; //error
//        int num4 = (int)(num1);
//
//        System.out.println(num2 +"-> "+ num3);
//        System.out.println(num1 +"-> "+ num4);
//        System.out.println((byte)(num2)); //it will give the remainder

//        ====================== Auto type promotion ============================================

//        byte a = 5;
//        byte b = 100;
//        //here a and b are byte which on multiply will become large, but java will automatically promote it as an int
//        int c = (a * b) / 10;
//        System.out.println(c);

        int d = 'A';
        System.out.println(d);

        char str = (char)(56);
        System.out.println(str);


    }
}