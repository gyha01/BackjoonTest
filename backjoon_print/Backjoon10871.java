package backjoon_print;

import java.io.*;

public class Backjoon10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수 N(parts)개와 정수 X(target)
        String inputLine = br.readLine();
        String[] parts = inputLine.split(" ");

        int num = Integer.parseInt(parts[0]);
        int target = Integer.parseInt(parts[1]);


        // 배열 선언 및 배열 입력
        String[] arr = null;
        String array = br.readLine();
        arr = array.split(" ");

        for(int i = 0; i < arr.length; i++){
            if(Integer.parseInt(arr[i]) < target){
                bw.write(String.valueOf(arr[i]) + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
