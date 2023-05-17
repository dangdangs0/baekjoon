import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Code10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<N;i++){
            String[] temp=br.readLine().split(" ");

            if(temp[0].equals("push_back")){
                deque.addLast(Integer.valueOf(temp[1]));
            }
            else if(temp[0].equals("push_front")){
                deque.addFirst(Integer.valueOf(temp[1]));
            }
            else if(temp[0].equals("front")){
                if(deque.isEmpty()){
                    bw.write("-1"+"\n");
                }
                else{
                    bw.write(String.valueOf(deque.getFirst())+"\n");
                }
            }
            else if(temp[0].equals("back")){
                if(deque.isEmpty()){
                    bw.write("-1"+"\n");
                }
                else{
                    bw.write(String.valueOf(deque.getLast())+"\n");
                }
            }
            else if(temp[0].equals("pop_front")){
                if(deque.isEmpty()){
                    bw.write("-1"+"\n");
                }
                else{
                    bw.write(String.valueOf(deque.pollFirst())+"\n");
                }
            }
            else if(temp[0].equals("pop_back")){
                if(deque.isEmpty()){
                    bw.write("-1"+"\n");
                }
                else{
                    bw.write(String.valueOf(deque.pollLast())+"\n");
                }
            }
            else if(temp[0].equals("size")){
                bw.write(String.valueOf(deque.size())+"\n");
            }
            else if(temp[0].equals("empty")){
                if(deque.isEmpty()){
                    bw.write("1"+"\n");
                }
                else{
                    bw.write("0"+"\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
