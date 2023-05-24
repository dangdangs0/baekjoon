import java.io.*;
import java.util.*;

public class Code18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());
        Queue<Integer> queue=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        int last=0;
        for(int i=0;i<N;i++){
            String[] temp=br.readLine().split(" ");
            if(temp[0].equals("push")){
                queue.add(Integer.valueOf(temp[1]));
                last=Integer.valueOf(temp[1]);
            }
            else{
                if(temp[0].equals("pop")){
                    if(queue.isEmpty()){
                        sb.append("-1"+"\n");
                        continue;
                    }
                    else{
                        sb.append(String.valueOf(queue.poll())+"\n");
                        continue;
                    }
                }
                else if(temp[0].equals("size")){
                    sb.append(String.valueOf(queue.size())+"\n");
                    continue;
                }
                else if(temp[0].equals("empty")){
                    if(queue.isEmpty()){
                        sb.append("1"+"\n");
                        continue;
                    }
                    else{
                        sb.append("0"+"\n");
                        continue;
                    }
                }
                else if(temp[0].equals("front")){
                    if(queue.isEmpty()){
                        sb.append("-1"+"\n");
                        continue;
                    }
                    else{
                        sb.append(String.valueOf(queue.peek())+"\n");
                        continue;
                    }
                }
                else if(temp[0].equals("back")){
                    if(queue.isEmpty()){
                        sb.append("-1"+"\n");
                        continue;
                    }
                    else{
                        sb.append(String.valueOf(last)+"\n");
                        continue;
                    }
                }
            }
        }
        br.close();

        System.out.println(sb);
    }
}
