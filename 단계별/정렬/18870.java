import java.io.*;
import java.util.*;
import java.util.stream.Stream;

class Pair{
    int index;
    int value;

    public Pair(int index, int value){
        this.index=index;
        this.value=value;
    }
}

public class Code18870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());

        String nums=br.readLine();
        int[] dot= Stream.of(nums.split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        int prior=0;
        int priorvalue=0;


        List numbers=new ArrayList();

        for(int i=0;i<N;i++){
            numbers.add(new Pair(i,dot[i]));
        }

        Collections.sort(numbers, new Comparator() {
            public int compare(Object o1,Object o2){
                return (((Pair)o1).value) - (((Pair)o2).value);
            }
        });

        int rank=0;
        int priorrank=0;
        for(Object pair: numbers){
            Integer temp=(((Pair)pair).value);//-10

            ((Pair) pair).value=rank;

            if(rank!=0 && prior==temp){ // -10 -9 2 4 4
//                rank=rank-1;
                ((Pair) pair).value=priorrank;
            }
            else{
                rank++;
            }

            priorrank=((Pair) pair).value;
            prior=temp;
        }

        Collections.sort(numbers, new Comparator() {
            public int compare(Object o1,Object o2){
                return (((Pair)o1).index) - (((Pair)o2).index);
            }
        });

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int plus=0;
        for(Object pair: numbers){
            String answer=String.valueOf(((Pair) pair).value);
            if(plus+1==N){
                bw.write(answer);
            }
            else{
                bw.write(answer+" ");
            }
            plus++;

        }

        bw.flush();
        bw.close();

    }
}
