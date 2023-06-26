import java.util.Scanner;

public class Code108168 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        int v=day/5;
        for(int i=0;i<v;i++){
            System.out.print("V");
        }
        int i=day%5;
        for(int j=0;j<i;j++){
            System.out.print("I");
        }
    }
}
