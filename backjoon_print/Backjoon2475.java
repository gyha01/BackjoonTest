package backjoon_print;

import java.io.*;

public class Backjoon2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 고유번호 5자리
        String[] numbers = br.readLine().split(" ");
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            number[i] = Integer.parseInt(numbers[i]);
        }

        int sum = 0;
        for(int i = 0; i < number.length; i++){
            sum+=(number[i] * number[i]);
        }

        int num = sum % 10;
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
    }
}
