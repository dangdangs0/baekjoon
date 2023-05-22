import java.util.Scanner;

public class Code15652 {
    public static int[] arr;
    public static StringBuilder sb=new StringBuilder();
    public static int N;
    public static int M;
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        arr=new int[M];

        backt(1,0);

        System.out.println(sb);
    }
    public static void backt(int start,int depth){
        if(depth==M){
            for(int n:arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start;i<=N;i++){

            arr[depth]=i;
            backt(i,depth+1);

        }
    }
}
