package backjoon_print;

import java.util.Scanner;

public class backjoon25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 4;
        String str = "";

        for(int i = 1; i <= a; i++){
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
