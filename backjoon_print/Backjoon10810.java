package backjoon_print;

import java.io.*;

public class Backjoon10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 바구니 n개와 공 넣을 횟수 m
        String nminfo = br.readLine();
        String[] basketInfo = nminfo.split(" ");

        int basketNum = Integer.parseInt(basketInfo[0]);
        int count = Integer.parseInt(basketInfo[1]);

        // 바구니 배열
        int[] basket = new int[basketNum];

        // i번 바구니 ~ j번 바구니 , k번 번호의 공
        // 바구니 배열의 길이는 n, 범위는 i ~ j
        // 공의 범위는 1 ~ n , 넣는 건 k번

        int ballNum = 0;
        int basketNumI = 0;
        int basketNumJ = 0;

        // count만큼 입력
        for(int i = 0 ; i<count; i++){
            String IJKNum = br.readLine();
            String[] IJKArray = IJKNum.split(" ");

            basketNumI = Integer.parseInt(IJKArray[0]) - 1;
            basketNumJ = Integer.parseInt(IJKArray[1]) - 1;
            ballNum = Integer.parseInt(IJKArray[2]);


            // I번이 J번보다 작거나 같을 때, I번의 공은 k번
            for(int j = basketNumI; j <= basketNumJ; j++) {
                basket[j] = ballNum;
            }
        }

        //입출력 - for문으로 출력
        for(int i = 0; i < basket.length; i++){
            bw.write(String.valueOf(basket[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
