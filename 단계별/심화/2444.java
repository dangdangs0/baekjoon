import java.util.Scanner;

public class Code2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		num=scanner.nextInt();
		
		for(int i=0;i<num;i++) { //upside
			for(int j=i;j<num-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*(i+1)-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=num-2;i>=0;i--) {
			for(int j=i;j<num-1;j++) {
				System.out.print(" ");
			}
			for(int k=2*(i+1)-1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
