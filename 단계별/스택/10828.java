import java.io.*;
import java.util.Stack;

public class Code10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<N;i++){
            String[] temp=br.readLine().split(" ");

            if(temp[0].equals("push")){
                stack.push(Integer.valueOf(temp[1]));
            }
            else if(temp[0].equals("top")){
                if(stack.empty()){
                    bw.write(String.valueOf(-1)+"\n");
                }
                else{
                    bw.write(String.valueOf(stack.peek())+"\n");
                }
            }
            else if(temp[0].equals("size")){
                bw.write(String.valueOf(stack.size())+"\n");
            }
            else if(temp[0].equals("empty")){
                if(stack.empty()){
                    bw.write(String.valueOf(1)+"\n");
                }
                else{
                    bw.write(String.valueOf(0)+"\n");
                }
            } else if (temp[0].equals("pop")) {
                if(stack.empty()){
                    bw.write(String.valueOf(-1)+"\n");
                }
                else{
                    bw.write(String.valueOf(stack.pop())+"\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
