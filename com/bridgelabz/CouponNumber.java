package com.bridgelabz;

public class CouponNumber {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        String  str = "";
        int random=(int) (Math.random()*max);
        while (random > 0){
            int n = random%10;
            str += String.valueOf(chars[n]);
            random = random/10;
        }
        System.out.println( "Coupon number is "+str);
    }
}
