
import java.util.Scanner;

public class Code1436 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int six=666;
        int count=0;
        while(count!=N){
            if(String.valueOf(six).contains("666")){
                count++;
            }
            if(count==N){
                break;
            }
            six++;
        }

        System.out.println(six);
    }
}
