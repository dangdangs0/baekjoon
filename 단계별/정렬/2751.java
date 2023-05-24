import java.io.*;
import java.util.Arrays;

public class Code2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());
        int[] nums=new int[N];

        for(int i=0;i<N;i++){
            nums[i]=Integer.valueOf(br.readLine());
        }
        br.close();

        Arrays.sort(nums);

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<N;i++){
            String temp=String.valueOf(nums[i]);
            bw.write(temp+'\n');
        }
        bw.flush();
        bw.close();
    }
}
