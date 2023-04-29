import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());

//        String[] word=new String[N];
        ArrayList<String> word=new ArrayList<String>();
        int count=0;

        for(int i=0;i<N;i++){
            if (count==N){
                break;
            }
            word.add(br.readLine());
            count++;
            for(int j=0;j<i;j++){
                if(word.get(i).equals(word.get(j))){//중복된 문자 없애자~
                    word.remove(j);
                    i=i-1;
                    break;
                }
            }
        }
        br.close();

        int len=word.size();

        Collections.sort(word); //알파벳 순 정렬

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(word.get(i).length()>word.get(j).length()){
                    word.add(i,word.get(j));
                    word.remove(j+1);
                }
            }
        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<len;i++){
            String answer=word.get(i);
            bw.write(answer+'\n');
        }
        bw.flush();
        bw.close();

    }
}
