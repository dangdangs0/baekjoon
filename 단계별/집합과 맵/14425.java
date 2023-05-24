import java.io.*;
import java.util.HashSet;
import java.util.stream.Stream;

public class Code14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String number=br.readLine();
        int[] num= Stream.of(number.split(" ")).mapToInt(Integer::parseInt).toArray();

        int N=num[0];//N
        int M=num[1];//M

        HashSet<String> S=new HashSet<String>();
        for(int i=0;i<N;i++){
            S.add(br.readLine());
        }

        String[] test=new String[M];
        for(int i=0;i<M;i++){
            test[i]=br.readLine();
        }
        br.close();

        int count=0;
        for(int i=0;i<M;i++){
            if(S.contains(test[i])){
                count++;
            }
        }

//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(count);
//        bw.flush();
//        bw.close();
        System.out.println(count);
    }
}
