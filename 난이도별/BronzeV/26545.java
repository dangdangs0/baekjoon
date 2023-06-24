import java.util.Scanner;

public class Code26545 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        int count=sc.nextInt();

        for(int i=0;i<count;i++){
            total+=sc.nextInt();
        }

        System.out.println(total);
    }
}
