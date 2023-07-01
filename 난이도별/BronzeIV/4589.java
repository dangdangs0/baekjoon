import java.util.Scanner;

public class Code4589 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Gnomes:");
        for(int i=0;i<n;i++){
            int[] gob=new int[3];
            for(int j=0;j<3;j++){
                gob[j]=sc.nextInt();
            }

            if(gob[0]>gob[1]){
                if(gob[0]>gob[2] && gob[1]>gob[2]){
                    System.out.println("Ordered");
                }
                else{
                    System.out.println("Unordered");
                }
            }
            else if(gob[0]<gob[1]){
                if(gob[1]<gob[2] && gob[0]<gob[2]){
                    System.out.println("Ordered");
                }
                else{
                    System.out.println("Unordered");
                }
            }
        }
    }
}
