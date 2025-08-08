package backjoon_print;

import java.io.*;

public class Backjoon2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값은 9개로 고정됨
        int len = 9;

        // int 배열 만들기
        int[] array = new int[len];

        for(int i = 0 ; i < len; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        // 여기서 정렬은 사용하면 안 됨
        int max = array[0];
        int order = 1;

        for(int i = 0; i  < len; i++){
           if(array[i] > max){
               max = array[i];
               order = i + 1;
           }
        }

        bw.write(String.valueOf(max) + "\n" + String.valueOf(order));
        bw.flush();
        bw.close();

    }
}
