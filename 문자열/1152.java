import java.util.Scanner;

public class Code1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int count=1;
		
		String numString;
		numString=scanner.nextLine(); //한 줄 입력
		
		char[] string=new char[numString.length()];
		string=numString.toCharArray();
		
		for(int i=0;i<string.length;i++) {
			if(i==0) {
				if(string.length==1&&string[i]==' ') {
					count=0;
					break;
				}
				
				else if(string[i]==' ') {
					continue;
				}
				
			}
			else if(i==string.length-1) {
				if(string[i]==' ') {
					continue;
				}
			}
			else if(string[i]==' ') {
				count=count+1;
			}
			
		}

		System.out.println(count);
	}

}
