import java.util.Scanner;

public class Code2903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int answer=0;
		
		n=n+1;
		
		answer=dot(n)*dot(n);

		
		System.out.println(answer);
	}
	public static int dot(int n) {
		int count=0;
		if(n==1) {
			count=2;
		}
		else {
			count=dot(n-1)+dot(n-1)-1;
		}
		return count;
	}

}
