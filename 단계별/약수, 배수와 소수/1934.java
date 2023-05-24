import java.io.*;

public class Code1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.valueOf(br.readLine());

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));


        for(int i=0;i<T;i++){
            String[] nums=br.readLine().split(" ");
            int A=Integer.valueOf(nums[0]);
            int B=Integer.valueOf(nums[1]);

            int small=0;
            int divisor=0;
            small=gcd(A,B);

            divisor=A/small;
            divisor*=B/small;
            divisor*=small;

            String answer=String.valueOf(divisor);
            bw.write(answer+"\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }

    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
