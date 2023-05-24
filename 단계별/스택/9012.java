import java.util.Scanner;
import java.util.Stack;

public class Code9012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        boolean no=false;
        boolean yes=false;

        Stack<String> vps=new Stack<>();
        for(int i=0;i<T;i++){
            no=false;
            yes=false;
            vps.clear();
            String temp=sc.next();
            for(int j=0;j<temp.length();j++){
                if(temp.charAt(j)=='('){
                    vps.push(String.valueOf(temp.charAt(j)));
                }
                else{
                    if(vps.empty()){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.pop().equals(")")){
                        no=true;
                        yes=false;
                        break;
                    }
                    else{//vps.pop().equals("(")
                        yes=true;
                        no=false;
                    }
                }

            }
            if(!vps.empty()){
                yes=false;
                no=true;
            }

            if(yes){
                System.out.println("YES");
            }
            else if(no){
                System.out.println("NO");
            }
        }
    }
}
