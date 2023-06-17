import java.math.BigInteger;
import java.util.Scanner;

public class Code22193 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        BigInteger A=sc.nextBigInteger();
        BigInteger B=sc.nextBigInteger();

        System.out.println(A.multiply(B));
    }
}
