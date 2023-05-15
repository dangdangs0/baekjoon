import java.util.Scanner;
import java.util.Stack;

public class Code1874 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String out="";
        boolean no=false;

        Stack<Integer> nums=new Stack<>();
        int first=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int start=1;
        for(int i=0;i<first;i++){//ex)4
            nums.push(start);
//            out+="+"+"\n";
            sb.append("+"+"\n");
            start++;
        }
        nums.pop();
//        out+="-"+"\n";
        sb.append("-"+"\n");

        for(int i=1;i<n;i++){
            int num=sc.nextInt();
            if(!nums.empty()){
                if(nums.peek()>num){
//                    out="";
//                    out="NO";
//                    System.out.println(out);
                    no=true;
                }
                else if(nums.peek()==num){
//                    out+="-"+"\n";
                    sb.append("-"+"\n");
                    nums.pop();
                }
                else{
                    int temp=start;
                    for(int j=temp;j<=num;j++){
                        nums.push(j);
//                        out+="+"+"\n";
                        sb.append("+"+"\n");
                        start++;
                    }
//                    out+="-"+"\n";
                    sb.append("-"+"\n");
                    nums.pop();
                }
            }
            else{
                int temp=start;
                for(int j=temp;j<=num;j++){
                    nums.push(j);
                    sb.append("+"+"\n");
//                    out+="+"+"\n";
                    start++;
                }
                sb.append("-"+"\n");
//                out+="-"+"\n";
                nums.pop();
            }
        }

        if(no){
            sb.setLength(0);
            sb.append("NO"+"\n");
        }
        System.out.println(sb);
    }
}
