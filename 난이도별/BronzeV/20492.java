import java.util.Scanner;

public class Code20492 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int first=(int)(N*0.78);
        int second=(int)(N*0.8+N*0.2*0.78);

        System.out.println(first+" "+second);
    }
}
