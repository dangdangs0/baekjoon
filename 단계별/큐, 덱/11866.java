import java.util.ArrayList;
import java.util.Scanner;

public class Code11866 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer> human=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("<");

        for(int i=1;i<=N;i++){
            human.add(i);
        }

        int index=K-1;
        while(!human.isEmpty()){
            sb.append(String.valueOf(human.get(index)));
            human.remove(index);
            index=index+K-1;

            if(human.isEmpty()){
                sb.append(">");
                break;
            }
            else{
                sb.append(", ");
            }

            while(index>=human.size()){
                index=index-human.size();
            }

        }
        System.out.println(sb);
    }
}
