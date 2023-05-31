import java.util.Scanner;

public class Code15727 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        if(L<=5){
            System.out.println(1);
        }
        else if(L%5==0){
            System.out.println(L/5);
        }
        else{
            System.out.println(L/5+1);
        }
    }
}
