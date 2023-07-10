import java.util.Scanner;

public class Code7595 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int p=sc.nextInt();
            if(p==0){
                break;
            }
            for(int i=0;i<p;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
