import java.util.Scanner;

public class Code6887 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tile=sc.nextInt();
        int count=(int)Math.sqrt(tile);

        System.out.println("The largest square has side length "+count+".");
    }
}
