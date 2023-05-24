import java.io.*;
import java.util.*;

public class Code1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]number=br.readLine().split(" ");
        int N=Integer.valueOf(number[0]); //듣도 못함
        int M=Integer.valueOf(number[1]); //보도 못함

        HashMap<String,Integer> nolisten=new HashMap<>();
        for(int i=0;i<N;i++){
            nolisten.put(br.readLine(),i);
        }

        HashMap<Integer,String> noListenSee=new HashMap<>();
        Integer count=0;
        for(int j=0;j<M;j++){
            String temp=br.readLine();
            if(nolisten.get(temp)!=null){//듣보잡
                noListenSee.put(count,temp);
                count++;
            }
        }
        br.close();



        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count+"\n");

        List<String> noList=new ArrayList<>(noListenSee.values());
        noList.sort(String::compareTo);

        for(String value:noList){
            bw.write(value+"\n");
        }

        bw.flush();
        bw.close();
    }
}
