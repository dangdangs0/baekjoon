import java.util.Scanner;

public class Code8370 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();//비즈니스 석 행 수
        int k1=sc.nextInt();//각 행에 있는 좌석 수
        int n2=sc.nextInt();//이코노미 석 행 수
        int k2=sc.nextInt();//각 행의 좌석 수

        System.out.println(n1*k1+n2*k2);
    }
}
