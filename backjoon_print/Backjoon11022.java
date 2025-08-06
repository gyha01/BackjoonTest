package backjoon_print;

import java.io.*;

public class Backjoon11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for(int i = 0; i < testCase; i++){
            String reader = bf.readLine();
            String[] num = reader.split(" ");

            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);

            bw.write("Case #" + (i+1) + ": " + A + " + " + B + " = " + String.valueOf(A + B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
