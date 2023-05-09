import java.util.Scanner;

public class Code11050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        System.out.println(fact(N)/(fact(K)*fact(N-K)));

    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
