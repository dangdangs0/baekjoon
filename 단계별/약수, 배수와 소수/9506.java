import java.util.Arrays;
import java.util.Scanner;

public class Code9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		boolean isRoop=true;
		
		int[] divisor=new int[10000];
		int sum=0;
		
		while(isRoop) {
			num=scanner.nextInt();
			sum=0;
			if(num==-1) {
				isRoop=false;
				break;
			}
			else {
				int i=1;
				int count=0;
				
				while(i<num) { //find divisor (except num)
					if(num%i==0) {
						divisor[count]=i;
						count++;
					}
					i++;
				}
				
				int[] array=new int[count];
				
				for(int j=0;j<count;j++) {
					array[j]=divisor[j];
					sum=sum+divisor[j];
				}
				
				Arrays.sort(array);
				if(sum==num) {
					System.out.print(num+" = ");
					for(int k=0;k<count;k++) {
						System.out.print(array[k]);
						if(k!=count-1) {
							System.out.print(" + ");
						}
					}
					System.out.println("");
				}
				else {
					System.out.println(num+" is NOT perfect.");
				}
				
			}
			
			
		}
		
		
		
		
		
	}

}
