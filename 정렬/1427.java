import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Code1427 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();
        int len=number.length();
        Integer[] strnum=new Integer[len];

        for(int i=0;i<len;i++){
            strnum[i]=Integer.valueOf(number.charAt(i)-'0');
        }

        Arrays.sort(strnum, Collections.reverseOrder());

        String answer="";
        for(int i=0;i<len;i++){
            answer=answer+String.valueOf(strnum[i]);
        }

        System.out.println(Integer.valueOf(answer));

    }
}
