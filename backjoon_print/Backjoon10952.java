package backjoon_print;

import java.io.*;

public class Backjoon10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String testCase = bf.readLine();
            String[] num = testCase.split(" ");

            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);

            if(A == 0 && B == 0) {
                bw.flush();
                break;
            }

            bw.write(String.valueOf(A + B));
            bw.newLine();
        }
        bw.close();

    }
}
