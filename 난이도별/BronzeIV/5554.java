import java.util.Scanner;

public class Code5554 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int goSchool=sc.nextInt();
        int goPC=sc.nextInt();
        int goAca=sc.nextInt();
        int goHome=sc.nextInt();

        int second=goAca+goHome+goPC+goSchool;

        System.out.println(second/60);//분
        System.out.println(second%60);//초
    }
}
