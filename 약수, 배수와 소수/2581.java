import java.util.Scanner;

public class Code2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int M=scanner.nextInt();
		int N=scanner.nextInt();
		
		int sum=0;
		int min=0;
		
		int count=0;
		
		for(int i=M;i<=N;i++) {
			if(i==1) {
				continue;
			}
			else {
				int j=1;
				count=0;
				while(i>=j) {
					if(i%j==0) {
						count++;
					}
					j++;
				}
				if(count==2) {
					sum=sum+i;
					if(min==0) {
						min=i;
					}
				}
			}
			
		}
		
		
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
