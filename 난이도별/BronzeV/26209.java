import java.util.Scanner;

public class Code26209 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean isError=false;
        for(int i=0;i<8;i++){
            int num=sc.nextInt();

            if(num==9){
                isError=true;
            }
        }
        if(isError){
            System.out.println("F");
        }
        else{
            System.out.println("S");
        }

    }
}
