package backjoon_print;

import java.io.*;

public class Backjoon5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 과제 낸 사람 입력 받기
        int[] submitStu = new int[29];
        for(int i = 1; i < 29; i++){
            submitStu[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i < 31; i++){
            boolean submit = false;
            for(int j = 0; j < submitStu.length; j++){
                if(submitStu[j] == i){
                    submit = true;
                    break;
                }
            }

            if(!submit){
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
