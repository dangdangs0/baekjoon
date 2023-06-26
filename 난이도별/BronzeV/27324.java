import java.util.Scanner;

public class Code27324 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ten=n/10;
        int one=n%10;
        if(ten==one){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
