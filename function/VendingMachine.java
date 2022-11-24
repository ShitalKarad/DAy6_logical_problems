package function;

import java.util.Scanner;

public class VendingMachine {
    static String change ="";
    public static void main(String[] args) {
        System.out.println("welcome in vending machine \n Enter your amount you have to change");
        Scanner sc = new Scanner(System.in);
        int rs = sc.nextInt();
        String money=vending(rs);
        System.out.println("change => "+money);
    }
   public static String vending(int rs){
        int[] arr ={ 1,2,5,10,50,100,500,1000};
        for ( int i = arr.length-1; i>= 0;i--){
            if (  rs >= arr[i] && rs >=0 ){
                change += String.valueOf(arr[i]+",");
                rs-=arr[i];
                i++;
            }

        }
        return change;
    }
}
