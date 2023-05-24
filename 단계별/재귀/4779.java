import java.util.Scanner;
public class Code4779 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int N=sc.nextInt();
            System.out.println(line(N));
        }
        
    }
    public static String line(int n){
        StringBuilder answer=new StringBuilder();
        if(n==0){
            return "-";
        }
        StringBuilder previous=new StringBuilder(line(n-1));
        //`-`저장
        int len=previous.length();
        answer.append(previous);
        answer.append(" ".repeat(len));
        answer.append(previous);

        return answer.toString();
    }
}


