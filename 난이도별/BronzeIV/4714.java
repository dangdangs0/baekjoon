import java.util.Scanner;

public class Code4714 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double x=sc.nextDouble();

            if(x<0){
                break;
            }
            double y=x*0.167;

            String s=String.format("%.2f",x);
            String t=String.format("%.2f",y);
            System.out.println("Objects weighing "+s+" on Earth will weigh "+t+" on the moon.");
        }
    }
}
