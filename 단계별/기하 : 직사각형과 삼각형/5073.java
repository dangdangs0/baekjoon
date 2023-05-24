import java.util.Scanner;

import javax.xml.validation.Validator;

public class Code5073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		boolean isRoop=true;
		int a=0,b=0,c=0;
		
		while(isRoop) {
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			
			if(a==0 && b==0 && c==0) {
				isRoop=false;
				break;
			}
			if(isValid(a,b,c)){
				if(a==b) {
					if(a==c) {
						System.out.println("Equilateral");
					}
					else {
						System.out.println("Isosceles");
					}
				}
				else if(a==c) {
					System.out.println("Isosceles");
				}
				else if(b==c) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}
			else {// Not Valid
				System.out.println("Invalid");
			}
				
		}
	}

	public static boolean isValid(int a, int b, int c) {
		boolean isValid=true;
		if(a<b) {
			if(b<c) { //c is max
				if(c>=a+b) {
					isValid=false;
				}
			}
			else { // b is max
				if(b>=c+a) { 
					isValid=false;
				}
			}
		}
		else { // a>b
			if(a<c) {//c is max
				if(c>=a+b) { 
					isValid=false;
				}
			}
			else { // a is max
				if(a>=c+b) {
					isValid=false;
				}
			}
			
		}
		return isValid;
	}

}
