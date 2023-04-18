import java.util.Scanner;

public class Code2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int count=scanner.nextInt();
		int quarter=25;
		int dime=10;
		int nickel=5;
		int penny=1;
		
		int[] remain;
		int money=0;
		
		for(int i=0;i<count;i++) {
			money=scanner.nextInt();
			remain=new int[4];
			
			while(money!=0) {
				if(money/quarter>0) {
					remain[0]=money/quarter;
					money=money%quarter;
				}
				if(money/dime>0) {
					remain[1]=money/dime;
					money=money%dime;
				}
				if(money/nickel>0) {
					remain[2]=money/nickel;
					money=money%nickel;
				}
				if(money/penny>0) {
					remain[3]=money/penny;
					money=money%penny;
				}
			}
			
			for(int j=0;j<4;j++) {
				System.out.print(remain[j]+" ");
			}
		}
		
		
	}

}
