import java.util.Scanner;

public class Code11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int N=scanner.nextInt();
		int i=2;
		
		if(N!=1) { //N is not 1
			while(N>=i) {
				if(N%i==0) {
					System.out.println(i);
					N=N/i;
					i=2;
				}
				else {
					i++;
				}
			}
		}
		
	}

}
