
import java.util.Scanner;

public class Code10988 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String word=scanner.next();
		String reverseword="";
		
		for(int i=word.length()-1;i>=0;i--) {
			reverseword=reverseword+word.charAt(i);
		}
		
		if(reverseword.equals(word)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}

}
