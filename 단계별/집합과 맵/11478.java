import java.io.*;
import java.util.HashSet;

public class Code11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        br.close();

        HashSet<String> diffstr=new HashSet<>();
        int len=str.length();

        String temp="";

        int count=1;
        while(count<=len){
            for(int i=0;i<len;i++){
                temp="";
                if(i+count>str.length()){
                    break;
                }
                else{
                    temp=str.substring(i,i+count);
                    diffstr.add(temp);
                }
            }
            count++;
        }


        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String answer=String.valueOf(diffstr.size());
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
