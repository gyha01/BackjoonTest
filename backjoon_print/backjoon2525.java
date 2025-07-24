package backjoon_print;

import java.util.Scanner;

public class backjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NowHr = sc.nextInt();
        int NowMin = sc.nextInt();
        int needTime = sc.nextInt();

        int needHr = needTime / 60;
        int needMin = needTime % 60;

        if(NowMin + needMin >= 60){
            NowHr = NowHr + needHr + (NowMin + needMin)/60;
            NowMin = (NowMin + needMin) % 60;
        }else{
            NowHr = NowHr + needHr;
            NowMin = NowMin + needMin;
        }

        if(NowHr >= 24){
            NowHr = NowHr - 24;
        }

        System.out.printf("%d %d", NowHr, NowMin);
    }
}
