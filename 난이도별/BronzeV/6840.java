import java.util.Arrays;
import java.util.Scanner;

public class Code6840 {
    public static void main(String[] args) {
        int[] bowls=new int[3];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            bowls[i]=sc.nextInt();
        }

        Arrays.sort(bowls);

        System.out.println(bowls[1]);
    }
}
