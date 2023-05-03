import java.io.*;

public class Code2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());
        int[] plant=new int[N];
        for(int i=0;i<N;i++){
            plant[i]=Integer.valueOf(br.readLine());
        }
        br.close();

        int gap=gcd(plant[1]-plant[0],plant[2]-plant[1]);

        int count=0;
        int start=plant[0];
        while(start!=plant[N-1]){
            start=start+gap;
            count++;
        }

        count=count-(N-1);//마지막은 계산됨, 그리고 사이에 끼인것들 수는 빼줌

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
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
