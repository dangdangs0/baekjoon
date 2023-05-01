import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Code1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]counts=br.readLine().split(" ");

        int Acount=Integer.valueOf(counts[0]); //A집합 수
        int Bcount=Integer.valueOf(counts[1]); //B집합 수

        String[]As=br.readLine().split(" ");
        String[]Bs=br.readLine().split(" ");

        br.close();

        HashSet<Integer> answer=new HashSet<>();
        for(int i=0;i<Acount;i++){
            answer.add(Integer.valueOf(As[i]));
        }
        for(int i=0;i<Bcount;i++){
            if(answer.contains(Integer.valueOf(Bs[i]))){
                answer.remove(Integer.valueOf(Bs[i]));
            }
            else{
                answer.add(Integer.valueOf(Bs[i]));
            }

        }
        
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(answer.size()));

        bw.flush();
        bw.close();
    }
}
