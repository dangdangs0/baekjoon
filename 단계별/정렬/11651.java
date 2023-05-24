import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Code11651 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[][]dots=new int[N][2];

        for(int i=0;i<N;i++){
            dots[i][0]=scanner.nextInt();
            dots[i][1]=scanner.nextInt();
        }

        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        for(int i=0;i<N;i++){
            System.out.print(dots[i][0]);
            System.out.println(" "+dots[i][1]);
        }
    }
}
