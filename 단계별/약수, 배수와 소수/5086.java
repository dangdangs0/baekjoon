import java.util.Scanner;

public class Code5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int a=0,b=0;
		boolean isRoop=true;
		
		while(isRoop) {
			a=scanner.nextInt();
			b=scanner.nextInt();
			
			if(a==0 && b==0) {
				isRoop=false;
				break;
			}
			System.out.println(num(a, b));
			
		}
		
		
	}
	
	private static String num(int a,int b) {
		String returnString="";
		if(b%a==0) {
			returnString= "factor";
		}
		else if(a%b==0) {
			returnString="multiple";
		}
		else {
			returnString="neither";
		}
		return returnString;
		
	}

}
