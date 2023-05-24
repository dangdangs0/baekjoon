import java.util.Scanner;

public class Code1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int count=scanner.nextInt();
		int num=0;
		int answer=0;
		int countDivisor=0;
		
		for(int i=0;i<count;i++) {
			num=scanner.nextInt();
			if(num==1) { //1 is not prime number
				continue;
			}else {
				int j=1;
				countDivisor=0;
				while(num>=j) {
					if(num%j==0) {
						countDivisor++;
					}
					j++;
				}
				if(countDivisor==2) { //1 and self
					answer++;
				}
			}
		}
		System.out.println(answer);
		
		
	}
	
}
