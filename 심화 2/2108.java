import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Code2108 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashMap<Integer,Integer> map =new HashMap<>();
        int sum=0;


        int[] num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
            sum+=num[i];
            map.put(num[i],0);//최빈값 탐색을 위함
        }

        for(int i=0;i<N;i++){
            map.put(num[i],map.get(num[i])+1);
        }

        int max=0;
        for(int i=0;i<N;i++){
            if(max<map.get(num[i])){//값이 max보다 크면
                max=map.get(num[i]);
            }
        }

        HashSet<Integer> maxs=new HashSet<>();
        int count=0;
        for(int i=0;i<N;i++){
            if(max==map.get(num[i])){
                maxs.add(num[i]); //3이 3번 들어가도 3 하나만 있음
            }
        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        double first=(double)sum/(double)N;
        int t=0;
        if(first<0){
            if(Math.abs(first)-Math.abs((int)first)>=0.5){
               t=(int)first-1;
            }
            else{
                t=(int)first;
            }
        }
        else{
            t= (int) Math.round(first);
        }
        bw.write(String.valueOf(t)+"\n"); //산술평균
        Arrays.sort(num);
        bw.write(String.valueOf(num[N/2])+"\n");

        ArrayList<Integer> so=new ArrayList<>(maxs);
        Collections.sort(so);
        if(so.size()>=2){
            bw.write(String.valueOf(so.get(1))+"\n");
        }
        else{
            bw.write(String .valueOf(so.get(0))+"\n");
        }

        int n=num[num.length-1]-num[0];
        bw.write(String.valueOf(n));

        bw.flush();
        bw.close();

    }
}
