import java.util.ArrayList;
import java.util.Scanner;

public class Code23235 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=1;
        while(sc.hasNext()){
            ArrayList<String> arr=new ArrayList<>();
            String a=sc.nextLine();
            if(a.length()==1){
                if(Integer.valueOf(a)==0){
                    break;
                }
            }
            else{
                arr.add(a);
            }
            System.out.println("Case "+count+": Sorting... done!");
            count++;
        }
    }
}
