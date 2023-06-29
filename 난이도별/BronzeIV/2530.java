import java.util.Scanner;

public class Code2530 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int minute=sc.nextInt();
        int second=sc.nextInt();

        int time=sc.nextInt();
        int tM=time/60;
        int tS=time%60;

        second+=tS;
        if(second>=60){
            int plus=second/60;
            minute+=plus;
            second=second-60*plus;
        }
        minute+=tM;
        if(minute>=60){
            int plus=minute/60;
            hour+=plus;
            minute-=60*plus;
        }
        if(hour>=24){
            int plus=hour/24;
            hour-=24*plus;
        }

        System.out.println(hour+" "+minute+" "+second);
    }
}
