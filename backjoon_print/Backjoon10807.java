package backjoon_print;

import java.io.*;

public class Backjoon10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //정수의 개수
        String number = br.readLine();
        int num = Integer.parseInt(number);


        String[] arr = null;
        //정수 - 배열로 입력?
        String array = br.readLine();
        arr = array.split(" ");

        // 찾는 정수
        String findNum = br.readLine();
        int find = Integer.parseInt(findNum);

        // 정수 세기
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == find) {
                count++;
            }
        }
        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
