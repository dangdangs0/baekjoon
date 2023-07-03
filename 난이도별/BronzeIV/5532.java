import java.util.Scanner;

public class Code5532 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();// 방학기간
        int A=sc.nextInt();//국어 풀 페이지 수
        int B=sc.nextInt();//수학 풀 페이지 수
        int C=sc.nextInt();//국어 최대 페이지
        int D=sc.nextInt();//수학 최대 페이지

        int korea=0;
        int math=0;
        if(A%C!=0){
            korea=A/C+1;
        }else{
            korea=A/C;
        }

        if(B%D!=0){
            math=B/D+1;
        }else {
            math=B/D;
        }

        if(korea>=math){
            System.out.println(L-korea);
        }
        else{
            System.out.println(L-math);
        }

    }
}
