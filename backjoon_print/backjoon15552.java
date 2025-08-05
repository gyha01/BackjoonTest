package backjoon_print;

import java.io.*;

public class backjoon15552 {
    public static void main(String[] args) throws IOException {
        // BufferedReader, BufferedWriter, BufferedWriter.flush 이용해야 함
        // BufferedReader = Scanner ? <-- 공부해보고 풀 것

        /*
         BufferedReader = Scanner과 유사
         입력은 readLine();로 받을 수 있음, 데이터가 String으로 고정이므로 데이터 가공이 필요함.
         공백 단위로 데이터 가공 방법
         1. StringTokenizer에 nextToken() 함수를 사용
         2. String.split() 함수를 활용

         초기화 방법
         1. 공식 문서에서 BufferedReader를 찾아본다.
         2. Constructors Summary에서 기본 초기화 방식을 본다
         BufferedReader(Reader in)
         3. Reader 항목으로 들어가면 추상화가 되어 있으니 Direct Known Subclasses에 원하는 항목을 찾아본다.
         4. 현 경우에서는 InputStreamReader가 적절하니 초기화를 시켜서 사용한다.
         BufferedInputStream(InputStream in)
         5. InputStream in을 사용하라고 하지만 InputStream은 추상 클래스이기에 초기화가 불가능하다.
         따라서, 전역 개체를 찾아야 한다. 여기서 표준 입출력(콘솔 입출력)을 담당하고 있는 System 객체를 찾아가본다.
         6. System 문서에 들어가면 static final로 되어 있는 Field Summary에 InputStream in이 적혀 있다.
         고로, InputStream 대신 System이 들어가면 된다.

         readLine()을 쓸 때 주의할 점
         BufferedReader은 Scanner와 달리 내부적으로 예외를 처리하지 않기에 직접 명시적 처리를 해야 함
         1. main에 throws IOException을 붙이기 -> 예외가 생기면 JVM이 처리하도록 넘긴다는 뜻
         2. try - catch로 직접 예외 처리 -> 직접 대응하겠다는 방식
         */

        /*
         BufferedWriter = System.out.println(); 과 유사
         writer(원하는 값 + "\n"); 해당 버퍼에 있는 값을 전부 출력 저장
         개행이 필요하면 \n 또는 newLine()을 통해 처리해야 함

         flush(): 남아있는 데이터를 모두 출력 시킴
         close(): flush()를 닫음
        * */

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bf.readLine());

        for(int i = 0; i < testCase; i++){
            String reader = bf.readLine();
            String[] num = reader.split(" ");
            int A = Integer.parseInt(num[0]);
            int B = Integer.parseInt(num[1]);

            bw.write(String.valueOf(A + B));
            bw.newLine();
        }

        // 버퍼 안의 값 출력
        bw.flush();

        // 버퍼 종료
        bw.close();
    }
}
