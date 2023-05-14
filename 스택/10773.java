import java.util.ArrayList;
import java.util.Scanner;

public class Code10773 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();

        ArrayList<Integer> stack=new ArrayList<>();
        for(int i=0;i<k;i++){
            int num=sc.nextInt();
            if(num==0){
                stack.remove(stack.size()-1);
            }
            else{
                stack.add(num);
            }
        }

        int sum=0;
        for(int i=0;i<stack.size();i++){
            sum+=stack.get(i);
        }
        System.out.println(sum);
    }
}
