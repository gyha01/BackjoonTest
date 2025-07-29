package backjoon_print;

import java.util.Scanner;

public class Backjoon10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int TextCase = sc.nextInt();

        for(int i = 1; i <= TextCase; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
    }
}
