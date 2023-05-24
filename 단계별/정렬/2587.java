import java.util.Arrays;
import java.util.Scanner;

public class Code2587 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] natNum=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            natNum[i]=scanner.nextInt();
            sum+=natNum[i];
        }

        Arrays.sort(natNum);

        System.out.println(sum/5);
        System.out.println(natNum[5/2]);


    }
}
