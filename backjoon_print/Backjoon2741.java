package backjoon_print;

import java.io.*;

public class Backjoon2741 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i < n + 1; i++){
            bw.write(String.valueOf(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
