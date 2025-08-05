package backjoon_print;

import java.io.*;

public class Backjoon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int textCase = Integer.parseInt(bf.readLine());

        for(int i = 0; i < textCase; i++){
            String  reader = bf.readLine();
            String[] num = reader.split(" ");

            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);

            bw.write("Case #" + (i + 1) + ": " + String.valueOf(A + B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
