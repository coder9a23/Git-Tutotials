package com.vikasjavaproject;

import java.util.Scanner;

public class ADD {
            //adding one comment :
        public static int sumOfNumber(int a, int b){
            Scanner sc= new Scanner(System.in);
            int sum = a+b;
            return sum;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum=sumOfNumber(a,b);
            System.out.print("Addition of two no =");
            System.out.print(sum);
        }


}
