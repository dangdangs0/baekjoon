import java.util.Scanner;

public class Code5596 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minkuk=0;
        int manse=0;

        for(int i=0;i<4;i++){
            int score=sc.nextInt();
            minkuk+=score;
        }
        for(int i=0;i<4;i++){
            int score=sc.nextInt();
            manse+=score;
        }
        if(minkuk>=manse){
            System.out.println(minkuk);
        }else{
            System.out.println(manse);
        }
    }
}
