import java.util.Scanner;

public class Code24568 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int normal=sc.nextInt();
        int small=sc.nextInt();

        int total=normal*8+small*3;

        System.out.println(total-28);
    }
}
