package backjoon_print;

import java.util.Scanner;

public class backjoon14618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println(1);
        }else if(x < 0 && y > 0){
            System.out.println(2);
        }else if(x < 0 && y < 0){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
