import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Code1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int N=Integer.valueOf(temp[0]);
        int M=Integer.valueOf(temp[1]);
        String[] dels=br.readLine().split(" ");

        br.close();

        Deque<Integer> d=new LinkedList<>();
        for(int i=0;i<N;i++){
            d.add(i);
        }//0부터 9까지 저장

        int count=0;
        Boolean isLoop=true;



        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<M;i++){
            int del=Integer.valueOf(dels[i])-1;//먼저 첫번째 인덱스
            int right=0;
            int left=0;
            Deque<Integer> r=new LinkedList<>(d);
            Deque<Integer> l=new LinkedList<>(d);
            while(isLoop){
                if(r.getFirst()==del){
                    d=r;
                    count+=right;
                }
                else if(l.getFirst()==del){
                    d=l;
                    count+=left;
                }

                if(del==d.getFirst()){
                    //0이랑 0이 같느냐...
                    d.poll();
                    isLoop=false;
                }
                else{
                    //만약 1 8 4라서 0이랑 1은 다른거니까.. 처음 값이랑
                    //오른쪽으로 회전할지 왼쪽으로 회전할지 정하자
                    int temr=r.pollLast();//맨 끝을 제일 앞으로
                    r.addFirst(temr);
                    right++;
                    int teml=l.poll();//맨 처음을 제일 끝으로
                    l.addLast(teml);
                    left++;
                }
            }
            isLoop=true;
        }
        bw.write(String.valueOf(count));
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
