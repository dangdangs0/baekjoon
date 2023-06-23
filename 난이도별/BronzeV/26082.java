import java.util.Scanner;

public class Code26082 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rivalCost=sc.nextInt();
        int rivalPer=sc.nextInt();

        int rival=rivalPer/rivalCost;

        int warCost=sc.nextInt();
        int warPer=rival*3*warCost;

        System.out.println(warPer);
    }
}
