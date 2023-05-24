import java.util.Scanner;

public class Code15650 {
    public static StringBuilder sb=new StringBuilder();
    public static int N;
    public static int M;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        arr=new int[M];
        backtracking(1,0);

        System.out.println(sb);
    }

    public static void backtracking(int start, int depth){

        if(depth==M){
            for(int a:arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }


        for(int i=start;i<=N;i++){
            arr[depth]=i;
            backtracking(i+1,depth+1);
        }
    }

}
