package backjoon_print;

import java.io.*;

public class Backjoon1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 과목의 갯수
        int subject = Integer.parseInt(br.readLine());

        // 각 과목의 성적
        String[] subjects = br.readLine().split(" ");

        int[] grades = new int[subject];

        for(int i = 0; i < subjects.length; i++){
            grades[i] = Integer.parseInt(subjects[i]);
        }

        // 과목 성적 중 최고 점수인 m
        double m = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > m){
                m = grades[i];
            }
        }

        // 점수 / M * 100 -> greades[i] / m * 100
        double[] nowGrades = new double[subject];
        for(int i = 0; i < grades.length; i++){
            nowGrades[i] = grades[i] / m * 100;
        }

        // 현재 점수에서 평균 구하기
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < nowGrades.length; i++){
            sum += nowGrades[i];
        }
        avg = sum / nowGrades.length;

        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
    }
}
