import java.io.*;
import java.util.ArrayList;

public class Code4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean isLoop=true;

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        while(isLoop){
            int n=Integer.valueOf(br.readLine());
            ArrayList<Boolean> prime=new ArrayList<>();
            prime.add(false);//0
            prime.add(false);//1

            if(n==0){
                isLoop=false;
                break;
            }
            else{
                int N=2*n;
                for(int i=2;i<=N;i++){
                    prime.add(i,true);
                }

                for(int i=2;(i*i)<=N;i++){
                    if(prime.get(i)){
                        for(int j=i*i;j<=N;j+=i){
                            prime.set(j,false);
                        }
                    }
                }
            }

            int count=0;
            for(int i=n+1;i<=n*2;i++){
                if(prime.get(i)){
                    count++;
                }
            }
            bw.write(String.valueOf(count)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
