import java.util.Scanner;

public class Code15649 {
    public static StringBuilder sb=new StringBuilder();
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        arr=new int[M];
        visit=new boolean[N];

        backtracking(N,M,0);

        System.out.println(sb);

    }
    public static void backtracking(int N, int M, int depth){
        //depth로 재귀가 깊어질때마다 depth를 1씩 증가시켜 M과 같아지면 중지
        if(M==depth){
            for(int n:arr){
                sb.append(n).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i+1;
                backtracking(N,M,depth+1);
                visit[i]=false;
            }
        }
    }
}
