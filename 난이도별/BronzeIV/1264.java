import java.util.Scanner;

public class Code1264 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextLine()){
            String s=sc.nextLine();
            s=s.toLowerCase();
            if(s.equals("#")){
                break;
            }
            int count=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
