import java.math.BigInteger;
import java.util.Scanner;

public class Code24309 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        BigInteger c=sc.nextBigInteger();

        BigInteger x=b.subtract(c).divide(a);

        System.out.println(x);

    }
}
