import java.util.Scanner;

public class Code4696 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double n=sc.nextDouble();
            if(n==0){
                break;
            }else{
                double total=1+n;
                total+=n*n + n*n*n;
                total+=n*n*n*n;

                String result=String.format("%.2f",total);
                System.out.println(result);
            }
        }
    }

}
