import java.util.Arrays;
import java.util.Scanner;

public class Code1037 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] realD=new int[N];
        for(int i=0;i<N;i++){
            realD[i]=sc.nextInt();
        }
        Arrays.sort(realD);
        System.out.println(realD[0]*realD[N-1]);
    }
}
