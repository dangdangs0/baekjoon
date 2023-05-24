import java.util.Scanner;

public class Code2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		double noon=scanner.nextInt();
		double night=scanner.nextInt();
		double height=scanner.nextInt();
		
//		int now=0;
		int day=1;
		double calc=(height-noon)/(noon-night);
//		
//		while(now<height) {
//			now=now+noon;
//			if(now>=height) {
//				break;
//			}
//			now=now-night;
//			day++;
//		}
//		
//		System.out.println(day);
		if(calc%1==0.0) {
			day=day+(int)calc;
		}
		else {
			day=day+(int)calc+1;
			
		}
		System.out.println(day);
		
	}

}
