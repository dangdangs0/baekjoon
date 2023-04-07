import java.util.Scanner;

public class Code25314 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=0; //input
		n=scanner.nextInt();
		
		int count;
		count=n/4;
		
		for(int i=0;i<count;i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
