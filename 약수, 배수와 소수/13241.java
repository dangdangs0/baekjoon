import java.io.*;

public class Code13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums=br.readLine().split(" ");
        long A=Long.valueOf(nums[0]);
        long B=Long.valueOf(nums[1]);

        long small=0;
        long divisor=0;
        small=gcd(A,B);

        divisor=A/small;
        divisor*=B/small;
        divisor*=small;

        String answer=String.valueOf(divisor);
        bw.write(answer+"\n");

        br.close();

        bw.flush();
        bw.close();
    }

    public static long gcd(long a,long b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
