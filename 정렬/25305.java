import java.util.Arrays;
import java.util.Scanner;

public class Code25305 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//응시자
        int k=sc.nextInt();//상
        int cut=0;

        int[] score=new int[N];
        for(int i=0;i<N;i++){
            score[i]=sc.nextInt();
        }

        Arrays.sort(score);

        int count=0;
        for(int i=N-1;i>=0;i--){
            count++;
            if(count==k){
                cut=score[i];
                break;
            }
        }
        System.out.println(cut);
    }
}
