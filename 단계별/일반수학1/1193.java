import java.util.Scanner;

public class Code1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		boolean isRoop=true;
		int i=1;
		int sum=0;
		int temp=0;
		int up=0;
		int down=0;
		
		
		while(isRoop) {
			sum=i*(i+1)/2; //sum(1..i)
			if(sum>=n) {
				isRoop=false;
				break;
			}
			i++;
		}
		
		
		if(i%2==0) { //even
			temp=sum-((i-1)*i/2);
			n=n-((i-1)*i/2);
			
			up=1;
			down=temp;
			for(int j=1;j<n;j++) {
				up++;
				down--;
			}
			System.out.println(up+"/"+down);
		}else {
			if(i==1) {
				System.out.println("1/1");
			}
			else {
				temp=sum-((i-1)*i/2);
				n=n-((i-1)*i/2);
				
				up=temp;
				down=1;
				for(int j=1;j<n;j++) {
					up--;
					down++;
				}
				System.out.println(up+"/"+down);
			}
			
		}
	}

}
