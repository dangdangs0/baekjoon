import java.util.Scanner;

public class Code16099 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            long lt=sc.nextLong();
            long wt=sc.nextLong();

            long le=sc.nextLong();
            long we=sc.nextLong();

            if(lt*wt>le*we){
                System.out.println("TelecomParisTech");
            }
            else if(lt*wt<le*we){
                System.out.println("Eurecom");
            }
            else{
                System.out.println("Tie");
            }
        }
    }
}
