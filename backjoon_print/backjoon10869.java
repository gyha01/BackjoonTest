package backjoon_print;

import java.util.Scanner;

public class backjoon10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.printf("%d\n%d\n%d\n%d\n%d", A + B, A - B, A * B, A / B, A % B);
    }
}
