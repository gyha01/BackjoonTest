package backjoon_print;

import java.io.*;

public class Backjoon10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 바구니 갯수: n , 바구니 바꾸는 횟수: m
        String[] number = br.readLine().split(" ");
        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);

        // 바구니 배열
        int[] basket = new int[n];
        for(int i = 0; i < basket.length; i++){
            basket[i] = i + 1;
        }

        // m번 만큼 바구니 바꾸기
        // i번 바구니부터 j번 바구니까지 입력
        // for문 반복 횟수 m번
        // 바구니 번호는 1번부터 시작이니까 주의하기

        for(int a = 0; a < m; a++){
            // i, j 입력 받기
            String[] num = br.readLine().split(" ");
            int i = Integer.parseInt(num[0]) - 1;
            int j = Integer.parseInt(num[1]) - 1;

            while(i < j){
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;

                i++;
                j--;
            }
        }

        for(int i : basket){
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}
