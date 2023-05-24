import java.math.BigInteger;
import java.util.Scanner;

public class Code1010 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            BigInteger N=sc.nextBigInteger();
            BigInteger M=sc.nextBigInteger();

            BigInteger up=fact(M);
            BigInteger down1=fact(N);
            BigInteger down2=fact(M.subtract(N));

            System.out.println(up.divide(down1).divide(down2));
        }
    }

    public static BigInteger fact(BigInteger n){
        BigInteger num=new BigInteger("1");
        if(n.intValue()==0 || n.intValue()==1){
            BigInteger one=new BigInteger("1");
            return one;
        }
        return n.multiply(fact(n.subtract(num)));
    }
}
