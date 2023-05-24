import java.util.Scanner;

public class Code3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int x=0,y=0;
		int a,b;
		
		int[][] Dot=new int[3][2];
		for(int i=0;i<3;i++) {
			Dot[i][0]=scanner.nextInt();
			Dot[i][1]=scanner.nextInt();
		}
		a=Dot[0][0];
		b=Dot[0][1];
		
		if(a==Dot[1][0]) { //x
			x=Dot[2][0];
		}
		else if(a==Dot[2][0]){
			x=Dot[1][0];
		}
		else {
			x=a;
		}
		
		if(b==Dot[1][1]) { //y
			y=Dot[2][1];
		}
		else if(b==Dot[2][1]){
			y=Dot[1][1];
		}
		else {
			y=b;
		}
		
	
		System.out.println(x+" "+y);
		
	}

}
