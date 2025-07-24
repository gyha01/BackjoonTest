package backjoon_print;

import java.util.Scanner;

public class backjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int award = 0;

        // 조건 1 & 조건 2
        if(A == B && B == C){
            award = 10000 + (A * 1000);
        }
        else if(A == B || C == A){
            award = 1000 + (A * 100);
        }else if(B == C){
            award = 1000 + (B * 100);
        }
        // 조건 3
        else if(A > B){ //일단 B는 큰 숫자가 아님
            if(B > C){ //B가 더 크면 C는 자동으로 큰 수가 아니게 됨
                award = A * 100;
            }else if(C > A){ // C가 B보다 큼, C와 A 비교
                award = C * 100;
            }else{
                award = A * 100;
            }
        }else if(B > C){ //이미 A는 최고 큰 수가 아님 -> 참이면 B가 제일 큼
            award = B * 100;
        }else{
            award = C * 100;
        } //조건3 끝

        System.out.print(award);
    }
}
