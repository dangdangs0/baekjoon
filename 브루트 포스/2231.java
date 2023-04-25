import java.util.Scanner;

public class Code2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		boolean isFind=false;
		
		int i=1;
		while(i<N) {
			if(N==i+eachSum(i)) {
				isFind=true;
				break;
			}
			i++;
		}
		
		if(isFind) {
			System.out.println(i);
		}
		else {
			System.out.println(0);
		}
		
	}
	
	public static int eachSum(int n) {
		int sum=0;
		int count=0;
		boolean isRoop=true;
		int temp=n;
		int num=1;
		
		while(isRoop) {
			if(temp/10>0) {
				count++;
			}
			else {
				isRoop=false;
				break;
			}
			temp=temp/10;
		}
		
		for(int i=0;i<count;i++) {
			num=num*10;
		}
		
		while(n/10!=0) {
			sum=sum+n/num;
			n=n%num;
			num=num/10;
		}
		
		sum=sum+n;
		
		return sum;
	}

}
