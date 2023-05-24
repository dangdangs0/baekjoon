
import java.util.Scanner;

public class Code11720 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		int total=0;
		num=scanner.nextInt();
		
		String numString;
		numString=scanner.next();
		
		for(int i=0;i<num;i++) {
			int number=numString.charAt(i)-'0'; //char to int use ascii
			total=total+number;
		}

		System.out.println(total);
	}

}
