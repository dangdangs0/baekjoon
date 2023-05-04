import java.io.*;
import java.util.ArrayList;

public class Code17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.valueOf(br.readLine());
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<T;i++){
            int N=Integer.valueOf(br.readLine());
            ArrayList<Boolean> prime=new ArrayList<>();
            prime.add(false);//0
            prime.add(false);//1

            for(int j=2;j<=N;j++){
                prime.add(j,true);
            }

            for(int j=2;(j*j)<=N;j++){
                if(prime.get(j)){
                    for(int k=j*j;k<=N;k+=j){
                        prime.set(k,false);
                    }
                }
            }

            int count=0;
            for(int j=2;j<prime.size();j++){
                if(prime.get(j)){
                    int remain=N-j;
                    if(remain<j){ //j는 5인데 remain이 3인 경우
                        continue;
                    }
                    else{
                        if(prime.get(remain)){
                            count++;
                        }
                    }

                }
            }
            bw.write(String .valueOf(count)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
