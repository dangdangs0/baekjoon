import java.util.Scanner;

public class Code21300 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int beer=sc.nextInt()*5;
        int malt=sc.nextInt()*5;
        int wine=sc.nextInt()*5;
        int drinks=sc.nextInt()*5;
        int seltzer=sc.nextInt()*5;
        int water=sc.nextInt()*5;

        System.out.println(beer+malt+wine+drinks+seltzer+water);
    }
}
