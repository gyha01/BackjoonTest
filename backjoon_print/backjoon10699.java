package backjoon_print;

import java.text.SimpleDateFormat;
import java.util.Date;

public class backjoon10699 {
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
        String strNow = nowDate.format(now);
        System.out.print(strNow);
    }
}
