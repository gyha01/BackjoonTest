package backjoon_print;

import java.io.*;

public class Backjoon5717 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 친구 수
        while(true) {
            String[] friend = br.readLine().split(" ");
            int male = Integer.parseInt(friend[0]);
            int female = Integer.parseInt(friend[1]);

            if(male == 0 & female == 0){
                break;
            }

            bw.write(String.valueOf(male + female) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
