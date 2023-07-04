import java.util.Scanner;

public class Code5717 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int M=sc.nextInt();
            int F=sc.nextInt();
            if(M==0 && F==0){
                break;
            }
            else{
                System.out.println(M+F);
            }
        }
    }
}
