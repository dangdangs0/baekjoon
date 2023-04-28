import java.util.Arrays;
import java.util.Scanner;

public class Code2750 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        int[] number=new int[N];
        for(int i=0;i<N;i++){
            number[i]=scanner.nextInt();
        }

//        Arrays.sort(number);
//        for(int i=0;i<N;i++){
//            System.out.println(number[i]);
//        }

        int temp=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(number[i]>number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }

        for(int i=0;i<N;i++){
            System.out.println(number[i]);
        }
    }
}
