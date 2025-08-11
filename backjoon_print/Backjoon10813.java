package backjoon_print;

import java.io.*;

public class Backjoon10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 바구니 n개, 바구니 속 공은 바구니와 같음
        // 첫 줄에 n과 앞으로의 입력 횟수 m 개를 받음
        String[] NMNum = br.readLine().split(" ");

        int[] basket = new int[Integer.parseInt(NMNum[0])];
        int number = Integer.parseInt(NMNum[1]);

        // 바구니 배열 속 초기값(공 번호) 넣기
        for(int i = 0; i < basket.length; i++){
            basket[i] = i + 1;
        }


        // 공 입력 횟수 m번 & basket[i] = basket[j]번 교환(그럼 변수 추가로 하나 해서 교환?)
        for(int m = 0; m < number; m++){
            int blank = 0;
            String[] IJNum = br.readLine().split(" ");
            int i = Integer.parseInt(IJNum[0]) - 1;
            int j = Integer.parseInt(IJNum[1]) - 1;

          blank = basket[i];
          basket[i] = basket[j];
          basket[j] = blank;
        }

        // 출력
        for(int i = 0; i < basket.length; i++){
            bw.write(String.valueOf(basket[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
