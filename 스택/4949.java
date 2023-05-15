import java.util.Scanner;
import java.util.Stack;

public class Code4949 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean no=false;
        boolean yes=false;
        boolean isLoop=true;
        Stack<String> vps=new Stack<>();
        while(isLoop){
            no=false;
            yes=false;
            vps.clear();
            String temp=sc.nextLine();
            if(temp.equals(".")){
                isLoop=false;
                break;
            }
            for(int j=0;j<temp.length();j++){
                if(temp.charAt(j)!='(' && temp.charAt(j)!='['&&temp.charAt(j)!=')' && temp.charAt(j)!=']'){
                    yes=true;
                    no=false;
                    continue;
                }
                if(temp.charAt(j)=='(' || temp.charAt(j)=='['){
                    vps.push(String.valueOf(temp.charAt(j)));
                }
                else if(temp.charAt(j)==')'){
                    if(vps.empty()){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.peek().equals(")")){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.peek().equals("[")){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.peek().equals("(")){//vps.pop().equals("(")
                        vps.pop();
                        yes=true;
                        no=false;
                    }
                }
                else if(temp.charAt(j)==']'){
                    if(vps.empty()){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.peek().equals("]")){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.peek().equals("(")){
                        no=true;
                        yes=false;
                        break;
                    }
                    else if(vps.peek().equals("[")){//vps.pop().equals("(")
                        vps.pop();
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
                System.out.println("yes");
            }
            else if(no){
                System.out.println("no");
            }
        }
    }
}
