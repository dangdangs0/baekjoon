import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Code2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());
        int answer=1;

        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=N;i++){
            q.add(i);
        }
        
        while(q.size()!=1){
            q.poll();//제일 위에 카드 버림
            //2,3,4 남음 근데 2를 제일 아래로 옮기려면..
            int back=q.poll();
            q.add(back);

            if(q.size()==1){
                answer=q.poll();
                break;
            }
        }
        
        System.out.println(answer);
    }
}
