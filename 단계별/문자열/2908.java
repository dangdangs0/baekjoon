
import java.util.Scanner;

public class Code2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		char[] num1;
		char[] num2;
		num1=scanner.next().toCharArray();
		num2=scanner.next().toCharArray();
		
		String a,b;
		
		a=String.valueOf(reverse(num1));
		b=String.valueOf(reverse(num2));
		
		
		if(Integer.valueOf(a)<Integer.valueOf(b)){
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
		
	}

	public static char[] reverse(char[] c) {
		char[] reverse=new char[c.length];
		for(int i=0;i<c.length;i++) {
			for(int j=c.length-i;j>0;j--) {
				reverse[j-1]=c[i];
			}
			
		}
		return reverse;
	}

}
