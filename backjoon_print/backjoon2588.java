package backjoon_print;

import java.util.Scanner;

public class backjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int B1 = (B % 10);
        int B2 = ((B % 100) - B1);
        int B3 = (B % 1000) - (B1 + B2);

        int AB1 = A * B1;
        int AB2 = (A * B2) / 10;
        int AB3 = (A * B3) / 100;

        System.out.println(AB1);
        System.out.println(AB2);
        System.out.println(AB3);
        System.out.println(A * B);
    }
}
