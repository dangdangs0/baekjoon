import java.util.Scanner;

public class Code4299 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int plus=sc.nextInt();
        int minus=sc.nextInt();

        if(plus<minus){
            System.out.println(-1);
        }
        else if((plus+minus)%2!=0){
            System.out.println(-1);
        }
        else{
            int first=(plus+minus)/2;
            int second=second=plus-first;;
            System.out.println(first+" "+second);

        }
    }
}
