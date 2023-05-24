import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Code10814 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        String[][] client=new String[N][2];

        for(int i=0;i<N;i++){
            client[i][0]=scanner.next();
            client[i][1]=scanner.next();
        }

        Arrays.sort(client, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                return Integer.valueOf(o1[0])-Integer.valueOf(o2[0]) ;
            }
        });

        for(int i=0;i<N;i++){
            System.out.print(client[i][0]);
            System.out.println(" "+client[i][1]);
        }
    }
}
