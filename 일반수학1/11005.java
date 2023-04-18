import java.util.Scanner;

public class Code11005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int base=scanner.nextInt();
		String string=""; //need reverse
		
		 do{
			int temp=num%base;
			if(10<=temp) {
				string=string+(char)(temp-10+'A');
			}
			else{
				string=string+Integer.toString(temp);
			}
			num=num/base;
		}while(num>=base);
		 
		if(num!=0) {
			if(10<=num) {
				string=string+(char)(num-10+'A');
			}
			else{
				string+=Integer.toString(num);
			}
		}
		 
		StringBuffer sBuffer=new StringBuffer(string);
		String answer=sBuffer.reverse().toString();
		
		System.out.println(answer);
		
	}

}
