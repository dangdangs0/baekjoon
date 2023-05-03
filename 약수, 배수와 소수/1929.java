import java.io.*;
import java.util.ArrayList;

public class Code1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tem=br.readLine().split(" ");
        int M=Integer.valueOf(tem[0]);
        int N=Integer.valueOf(tem[1]);
        br.close();


        ArrayList<Boolean> prime=new ArrayList<>();
        prime.add(false);
        prime.add(false);

        for(int i=2;i<=N;i++){//일단 사이에 수 저장
            prime.add(i,true);
        }

        for(int i=2; (i*i)<=N; i++){
            if(prime.get(i)){
                for(int j = i*i; j<=N; j+=i) { //배수들
                    prime.set(j, false);
                }
            }
        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int j=M;j<=N;j++){
            if(prime.get(j)==true){
                bw.write(String.valueOf(j)+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
