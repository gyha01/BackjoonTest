package backjoon_print;

import java.io.*;

public class Backjoon3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 값을 10개 입력받아야 함
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        // 42로 나눈 나머지 값이 모인 배열 필요
        int[] remain = new int[10];
        for(int i = 0; i < 10; i++){
            remain[i] = array[i] % 42;
        }

        // 나머지 값 중 서로 다른 값이 몇 개 있는 지 찾기
        boolean[] check = new boolean[42];

        for(int i = 0; i < 10; i++){
            check[remain[i]] = true;
        }

        int count = 0;
        for(int i = 0; i < check.length; i++){
            if(check[i]){
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
