import java.util.Scanner;

public class Code25501 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            System.out.print(isPalindrome(sc.next())+" ");
            System.out.println(count);

            count=0;
        }
    }
    public static int recursion(String s,int left, int right){
        count++;
        if(left>=right) {
            return 1; //한글자 자리면!!
        }
        else if(s.charAt(left)!=s.charAt(right)){
            return 0;
        }
        else {
            return recursion(s, left + 1, right - 1);
        }
    }
    public static int isPalindrome(String str){
        return recursion(str,0,str.length()-1);
    }
}
