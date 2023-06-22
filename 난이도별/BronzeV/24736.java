import java.util.Scanner;

public class Code24736 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] visiting=new int[5];
        int[] home=new int[5];
        for(int j=0;j<5;j++){
            visiting[j]=sc.nextInt();
        }
        int vtotal=visiting[0]*6+visiting[1]*3+visiting[2]*2+visiting[3]*1+visiting[4]*2;

        for(int j=0;j<5;j++){
            home[j]=sc.nextInt();
        }
        int htotal=home[0]*6+home[1]*3+home[2]*2+home[3]*1+home[4]*2;


        System.out.println(vtotal+" "+htotal);
    }
}
