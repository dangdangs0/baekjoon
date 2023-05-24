import java.text.SimpleDateFormat;
import java.util.Date;

public class Code10699 {
    public static void main(String[] args) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

        Date today=new Date();
        String answer=format.format(today);
        System.out.println(answer);
    }
}
