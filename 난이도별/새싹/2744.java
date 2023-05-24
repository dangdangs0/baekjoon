import java.util.Scanner;

public class Code2744 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

        char[] c=word.toCharArray();

        for(int i=0;i<word.length();i++){
            if('A'<=c[i] && c[i]<='Z'){
                //소문자로
                c[i]=(char)(c[i]+32);
            }
            else{
                c[i]=(char)(c[i]-32);
            }
        }

        word=String.valueOf(c);
        System.out.println(word);
    }
}
