import java.util.Scanner;

public class Code4999 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String jewhan=sc.next();
        String doctor=sc.next();

        int jLen=jewhan.length();
        int dLen=doctor.length();

        if(jLen>=dLen){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}
