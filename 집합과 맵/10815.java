import java.io.*;
import java.util.HashMap;
import java.util.stream.Stream;

public class Code10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());

        String line=br.readLine();
        int[] card= Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        int M=Integer.valueOf(br.readLine());

        HashMap<Integer,Integer> haveCard=new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            haveCard.put(card[i],i);
        }

        String cardline= br.readLine();
        int[] ishave= Stream.of(cardline.split(" ")).mapToInt(Integer::parseInt).toArray(); //가지고 있는지 확인
        br.close();

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<M;i++){
            String temp="";
            if(haveCard.containsKey(ishave[i])){
                temp=String.valueOf(1);
                bw.write(Integer.valueOf(temp)+" ");
            }
            else{
                temp=String.valueOf(0);
                bw.write(Integer.valueOf(temp)+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
