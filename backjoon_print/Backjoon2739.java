package backjoon_print;

import java.util.Scanner;

public class Backjoon2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + i*num);
        }


        /*for(int i = 1; i <= num; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }*/
    }
}
