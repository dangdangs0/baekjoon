import java.util.Scanner;

public class Code5358 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            char[] ch=s.toCharArray();

            for(int i=0;i<ch.length;i++){
                if(ch[i]=='i'){
                    ch[i]='e';
                }
                else if(ch[i]=='e'){
                    ch[i]='i';
                }
                else if(ch[i]=='I'){
                    ch[i]='E';
                }
                else if(ch[i]=='E'){
                    ch[i]='I';
                }
            }
            String out=new String(ch);
            System.out.println(out);
        }
    }
}
