import java.util.Scanner;

public class Code4470 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.valueOf(sc.nextLine());

        String[] t=new String[N];
        for(int i=0;i<N;i++){
            t[i]=sc.nextLine();
        }

        for(int i=0;i<N;i++){
            System.out.println((i+1)+". "+t[i]);
        }
    }
}
