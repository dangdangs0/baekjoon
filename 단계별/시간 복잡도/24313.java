import java.util.Scanner;

public class Code24313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int a1=scanner.nextInt();
		int a0=scanner.nextInt();
		int c=scanner.nextInt();
		int n0=scanner.nextInt();
		
		double value=0;
		
		if(a1==c) {
			if(a0==0) {
				System.out.println(1);
			}
			else if(a0<0){
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else if(a1==0) { //ex) 7<=8n  n>=7/8
			if(a0==0) { //ex) 0<=7n , 0<=n
				System.out.println(1);
			}
			else if(a0<0) {
				System.out.println(1);
			}
			else {
				value=a0/c;
				getValue(n0, value);
			}
		}
		else {
			if(a1>c){//ex)10n+7<=8n 2n<=-7  n<=-7
				if(a0==0) {
					System.out.println(0);
				}
				else if(a0<0) {
					if(n0<=value) {
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
				}
				else {
					System.out.println(0);
				}
				
			}
			else if(a1<c){//ex)7n+7<=8n n>=7
				if(a0==0) {
					System.out.println(1);
				}
				else if(a0<0) {
					System.out.println(1);
				}
				else {
					value=a0/(c-a1);
					getValue(n0, value);
					
				}
			}
		}
		
	}

	public static void getValue(int n0, double value) {
		if(n0>=value) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
