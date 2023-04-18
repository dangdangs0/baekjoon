import java.util.Scanner;

public class Code2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		int base=scanner.nextInt();
		int len=string.length();
		int num=0;
		double total=0;
		int answer=0;
		
		for(int i=0;i<len;i++) {
			num=change(string, i);
			total=total+num*Math.pow(base, len-i-1);
		}
		
		answer=(int)total;
		System.out.println(answer);
		
	}

	public static int change(String string, int i) {
		int num=0;
		if('A'<=string.charAt(i) && string.charAt(i)<='Z') {
			num=string.charAt(i)-'A'+10;
		}
		else {
			num=string.charAt(i)-'0';
		}
		return num;
		
	}

}
