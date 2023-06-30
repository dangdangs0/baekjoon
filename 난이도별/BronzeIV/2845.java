import java.util.Scanner;

public class Code2845 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();//1제곱당 사람 수
        int P=sc.nextInt();//너비

        int[] arti=new int[5];
        for(int i=0;i<5;i++){
            arti[i]=sc.nextInt();
        }

        int total=L*P;
        for(int i=0;i<5;i++){
            System.out.print(arti[i]-total+" ");
        }
    }
}
