import java.util.Scanner;

public class Code2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int count=1;
		int first=2;
		
		if(n==1) {
			System.out.println(count);
		}
		else {
			while(first<=n) {
				first=first+count*6;
				count++;
			}
			System.out.println(count);
		}
		
		
		
	}

}
