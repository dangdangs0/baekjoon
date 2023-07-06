import java.util.Scanner;

public class Code6810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] isbn={9,7,8,0,9,2,1,4,1,8,0,0,0};
        for(int i=0;i<3;i++){
            int index=i+10;
            isbn[index]=sc.nextInt();
        }
        //isbn 배열에 index 저장
        int sum=0;
        for(int i=0;i<13;i++){
            if(i%2==0){
                //짝수번째는 1을 곱함
                sum+=isbn[i]*1;
            }
            else{
                sum+=isbn[i]*3;
            }
        }

        System.out.println("The 1-3-sum is "+sum);
    }
}
