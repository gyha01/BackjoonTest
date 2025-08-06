package backjoon_print;

import java.io.*;

public class Backjoon2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for(int i = 0; i < testCase; i++){
            for(int j = testCase - 1; j > i; j--){
                bw.write(" ");
            }

            for(int k = 0; k <= i; k++){
                bw.write("*");
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
