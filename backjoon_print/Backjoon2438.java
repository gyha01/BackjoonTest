package backjoon_print;

import java.io.*;

public class Backjoon2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for(int i = 0; i < testCase; i++){
            for(int j = 0; j <= i; j++) {
                String star = "*";
                bw.write(star);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
