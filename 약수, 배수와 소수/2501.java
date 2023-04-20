import java.util.Arrays;
import java.util.Scanner;

public class Code2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		int index=scanner.nextInt();
		
		int[] divisor=new int[10000];
		
		
		int i=1;
		int count=0;
		
		while(i<=num) {
			if(num%i==0) {
				divisor[count]=i;
				count++;
			}
			i++;
		}
		
		int[] array=new int[count];
		
		for(int j=0;j<count;j++) {
			array[j]=divisor[j];
		}
		
		Arrays.sort(array);
		
		if(index>count) {
			System.out.println(0);
		}
		else {
			System.out.println(array[index-1]);
		}
	}

}
