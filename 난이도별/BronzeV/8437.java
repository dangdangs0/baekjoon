import java.math.BigInteger;
import java.util.Scanner;

public class Code8437 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger total=sc.nextBigInteger();//10개 전체로 갖고 있음
        BigInteger more=sc.nextBigInteger();//2개 더 많이 갖고 있다

        BigInteger divide=new BigInteger("2");
        BigInteger answer=total.subtract(more).divide(divide);

        System.out.println(answer.add(more));
        System.out.println(answer);
    }
}
