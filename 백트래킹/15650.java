import java.util.Scanner;

public class Code15650 {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb=new StringBuilder();
    public static int N;
    public static int M;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        arr=new int[M];
        visit=new boolean[N];

        backt(0,0);

        System.out.println(sb);

    }

    public static void backt(int start, int depth){
        if(depth==M){
            for(int n:arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start;i<N;i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i+1;
                backt(i+1,depth+1);
                visit[i]=false;
            }

        }

    }
}
