package backjoon_print;

import java.io.*;

public class Backjoon11654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char s = br.readLine().charAt(0);
        int s2 = (int) s;
        bw.write(String.valueOf(s2));
        bw.flush();
        bw.close();
    }
}
