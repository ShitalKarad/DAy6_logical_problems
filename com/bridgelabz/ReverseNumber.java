package com.bridgelabz;

public class ReverseNumber {
    public static void main(String[] arg){
        int num = 247689;
        String rev ="";
        while(num!=0){
            rev +=String.valueOf(num%10);
            num = num/10;
        }
        System.out.println("Reverse number is "+rev );
    }
}
