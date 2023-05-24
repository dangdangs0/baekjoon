import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArraySet;

public class Code5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=0;
		int time=0;
		
		String alpha;
		alpha=scanner.next();
		
		for(int i=0;i<alpha.length();i++) {
			switch (alpha.charAt(i)) {
				case'A':
				case'B':
				case'C': {
					num=2;
					time=time+num+1;
					break;
				}
				case'D':
				case'E':
				case'F':{
					num=3;
					time=time+num+1;
					break;
				}
				case'G':
				case'H':
				case'I':{
					num=4;
					time=time+num+1;
					break;
				}
				case'J':
				case'K':
				case'L':{
					num=5;
					time=time+num+1;
					break;
				}
				case'M':
				case'N':
				case'O':{
					num=6;
					time=time+num+1;
					break;
				}
				case'P':
				case'Q':
				case'R':
				case'S':{
					num=7;
					time=time+num+1;
					break;
				}
				case'T':
				case'U':
				case'V':{
					num=8;
					time=time+num+1;
					break;
				}
				case'W':
				case'X':
				case'Y':
				case'Z':{
					num=9;
					time=time+num+1;
					break;
				}
				default :{
					num=1;
					time=time+num+1;
				}
			}
		}
		
		
		System.out.println(time);
	}
}
