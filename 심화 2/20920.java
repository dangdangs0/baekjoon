import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Code20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");

        int N=Integer.valueOf(temp[0]); //나올 단어 수
        int M=Integer.valueOf(temp[1]); //외울 단어 길이 (얘보다 길거나 같아야 외움)

//        ArrayList<voca> vocas=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
//        HashSet<String> t=new HashSet<>();

        for(int i=0;i<N;i++){
            String str=br.readLine();
            if(str.length()>=M){
                int n=map.getOrDefault(str,0);
                map.put(str,n+1);
//                t.add(str);
            }
        }
        br.close();

        List<String> voca=map.keySet().stream().collect(Collectors.toList());

        voca.sort((o1,o2)->{
            int a=map.get(o1);
            int b=map.get(o2);

            if(a==b){
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);//사전순
                }
                return o2.length()-o1.length();
            }
            return b-a;
        });



//        ArrayList<String> names=new ArrayList<>(t);
//
//
//        for(int i=0;i<map.size();i++){
//            vocas.add(new voca(names.get(i),map.get(names.get(i)),names.get(i).length()));
//        }

//        Comparator<voca> lens=Comparator.comparing(voca::getLen).reversed();
//        Comparator<voca> words=Comparator.comparing(voca::getWord);
//        vocas.sort(Comparator.comparing(voca::getCount).reversed().thenComparing(lens).thenComparing(words));
//
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//        for(voca v:vocas){
//            bw.write(v.getWord()+"\n");
//        }

        for(int i=0;i<voca.size();i++){
            bw.write(voca.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}

//class voca{
//    String word;
//    int count;
//    int len;
//
//    public int getCount(){
//        return count;
//    }
//    public int getLen(){
//        return len;
//    }
//    public String getWord(){
//        return word;
//    }
//    public voca(String word, int count, int len){
//        this.word=word;
//        this.count=count;
//        this.len=len;
//    }
//}

