import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] first=br.readLine().split(" ");
        int firstup=Integer.valueOf(first[0]);
        int firstdown=Integer.valueOf(first[1]);

        String[] second=br.readLine().split(" ");
        int secondup=Integer.valueOf(second[0]);
        int seconddown=Integer.valueOf(second[1]);

        br.close();
        int down=firstdown*seconddown;
        int up=firstup*seconddown+secondup*firstdown;

        int div=gcd(up,down);
        down=down/div;
        up=up/div;

        System.out.println(up+" "+down);

    }

    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
