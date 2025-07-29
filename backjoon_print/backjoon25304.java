package backjoon_print;

import java.util.Scanner;

public class backjoon25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int type = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= type; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();

            sum = price * count + sum;
        }

        if(sum == totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
