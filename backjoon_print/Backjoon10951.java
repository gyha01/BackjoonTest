package backjoon_print;

import java.io.*;

public class Backjoon10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String testCase;
        while((testCase = bf.readLine()) != null){
            /*testCase = bf.readLine();*/
            String[] num = testCase.split(" ");

            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);

            bw.write(String.valueOf(A+B));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}