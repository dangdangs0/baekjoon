
import java.util.Scanner;

public class Code10809 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int alpha[]=new int[26];
		
		String string;
		string=scanner.next();
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=-1;
		}
		
		for(int i=0;i<string.length();i++) {
			if(('a'<=string.charAt(i))&&(string.charAt(i)<='z')) {
				int count=0;
				
				//ex.aba
				
				count=string.charAt(i)-'a';
				if(alpha[count]!=-1) { //이미 앞에 한번 나왔으면
					continue;
				}
				alpha[count]=i;
			}
		}
		
		for(int i=0;i<alpha.length;i++) {
			System.out.print(alpha[i]+" ");
		}

	}

}
