import java.io.*;

public class Code4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long N=Long.valueOf(br.readLine());


        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<N;i++){
            long n=Long.valueOf(br.readLine());

            String temp="";
            if(n==0 || n==1){
                temp=String .valueOf(2);
            }
            else{
                temp=String .valueOf(prime(n));
            }

            bw.write(temp+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static long prime(long n){
        long start=2;
        
        for(long i=start;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return prime(n+1);
            }
        }

        return n;
    }
}
