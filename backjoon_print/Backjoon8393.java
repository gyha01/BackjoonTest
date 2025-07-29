package backjoon_print;

import java.util.Scanner;

public class Backjoon8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++){
           sum = sum + i;
           //System.out.println(sum);
        }
        System.out.println(sum);

    }
}
