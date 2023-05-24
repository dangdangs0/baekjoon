import java.io.*;

public class Code13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(br.readLine());
        br.close();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int answer=(int)Math.sqrt(N);
        bw.write(String .valueOf(answer)+"\n");
        bw.flush();
        bw.close();
    }
}
