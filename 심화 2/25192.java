import java.util.HashSet;
import java.util.Scanner;

public class Code25192 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        HashSet<String> hi=new HashSet<>();

        for(int i=0;i<N;i++){
            String temp=sc.next();

            if(temp.equals("ENTER")){
                sum+=hi.size();
                hi=new HashSet<>();
            }
            else{
                hi.add(temp);
            }
        }
        sum+=hi.size();
        System.out.println(sum);
    }
}
