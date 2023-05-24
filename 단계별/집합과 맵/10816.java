import java.io.*;
import java.util.HashMap;

public class Code10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());

        String value=br.readLine();
        String[] hCard=value.split(" ");

        int M=Integer.valueOf(br.readLine());
        String[] fCard=br.readLine().split(" ");

        br.close();
        HashMap<Integer,Integer> haveCard=new HashMap<>();

        for(int i=0;i<hCard.length;i++){
            int temp=Integer.valueOf(hCard[i]);
            if(haveCard.containsKey(temp)){ //이미 존재하는 키
                haveCard.put(temp,haveCard.get(temp)+1);
            }
            else{
                haveCard.put(temp,1);
            }

        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> findCard=new HashMap<>();
        for(int i=0;i<fCard.length;i++){
            int temp=Integer.valueOf(fCard[i]);//시작은 10
            if(haveCard.get(temp) == null){
                findCard.put(temp,0);
            }
            else{
                findCard.put(temp,haveCard.get(temp));
            }
            String answer=String.valueOf(findCard.get(temp)+" ");
            bw.write(answer);
        }

        bw.flush();
        bw.close();


    }
}
