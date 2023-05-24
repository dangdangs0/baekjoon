import java.util.Scanner;
import java.util.Stack;

public class Code11729 {
    public static int N;
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        sb.append(String.valueOf((int)Math.pow(2,N)-1)+"\n");

        Hanoi(N,1,2,3);
        System.out.println(sb);
    }

    public static void Hanoi(int n,int from, int place,int to){
        if(n==1){
            sb.append(from+" "+to+"\n");
            return;
        }

        //N개를 옮기려면 N-1개를 2번째로 옮긴 후
        //제일 마지막 판을 3번째로 옮긴다
        //다시 N-1개의 판을 3번째로 옮긴다
        Hanoi(n-1,from,to,place);
        sb.append(from+" "+to+"\n");
        Hanoi(n-1,place,from,to);
    }

}
