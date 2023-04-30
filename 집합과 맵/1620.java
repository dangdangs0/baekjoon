import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Code1620 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String number=br.readLine();
        int[] num= Stream.of(number.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N=num[0]; //도감
        int M=num[1]; //맞춰야 하는 문제 수

        Map<Integer,String> pokedex=new HashMap<Integer,String >();
        Map<String,Integer> namedex=new HashMap<String,Integer>();
        for(int i=0;i<N;i++){
            String poketmon=br.readLine();
            pokedex.put(i+1,poketmon); // 1, 이상해씨
            namedex.put(poketmon,i+1);
        }


        BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<M;i++){
            String question=br.readLine();
            if('0'<=question.charAt(0) && question.charAt(0)<='9'){ //도감번호 보고 포켓몬
                int quest=Integer.valueOf(question);
                String temp= pokedex.get(quest);
                bf.write(temp+'\n');
            }
            else{ //포켓몬 보고 도감번호
                String temp=String.valueOf(namedex.get(question));
                bf.write(temp+'\n');
            }
        }
        br.close();
        bf.flush();
        bf.close();
    }
}
