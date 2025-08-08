package backjoon_print;

import java.io.*;
import java.util.Arrays;

public class Backjoon10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 이중for문으로 최대 최소 비교? -> 시간 괜찮나?
        // sort로 정렬 후 맨 앞과 맨 뒤를 고르면 되나?

        // 정수의 개수 N개
        int len = Integer.parseInt(br.readLine());

        // 입력한 정수 배열로 처리
        String array = br.readLine();
        String[] arr = array.split(" ");

        // 정렬을 위한 int 배열 및 길이 할당
        int[] array1 = new int[len];

        for(int i = 0; i < len; i++){
            array1[i] = Integer.parseInt(arr[i]);
        }

        // sort 메소드로 정렬
        Arrays.sort(array1);

        bw.write(String.valueOf(array1[0]) + " ");
        bw.write(String.valueOf(array1[len-1]));

        bw.flush();
        bw.close();
    }
}
