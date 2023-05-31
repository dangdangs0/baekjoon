import java.math.BigInteger;
import java.util.Scanner;

public class Code14928 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String like=sc.next();
        long remain=0;

        for(int i=0;i<like.length();i++){
            remain=(remain*10+(like.charAt(i)-'0'))%20000303;
        }

        System.out.println(remain);
    }
}
