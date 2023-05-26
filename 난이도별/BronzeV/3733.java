import java.util.Scanner;

public class Code3733 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int N=sc.nextInt();
            N=N+1;//심사위원

            int S=sc.nextInt();

            System.out.println(S/N);
        }
    }
}
