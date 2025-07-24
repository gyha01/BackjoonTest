package backjoon_print;

import java.util.Scanner;

public class backjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HR = sc.nextInt();
        int Min = sc.nextInt();

        if(Min - 45 < 0){
            if(HR == 0){
                HR = 24;
            }
            HR = HR - 1;
            Min = 60 - 45 + Min;
        }else{
            Min = Min - 45;
        }
        System.out.printf("%d %d", HR, Min);
    }
}
