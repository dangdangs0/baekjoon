import java.util.Scanner;

public class Code10810 {

	public static void main(String[] args) {
		int basketNum=0;
		int putBall=0;
		int start=0;
		int end=0;
		int num=0;
		
		Scanner scanner=new Scanner(System.in);
		basketNum=scanner.nextInt(); //N
		putBall=scanner.nextInt();//M
		
		int array[]=new int[basketNum];
	
		for(int i=0;i<putBall;i++) {
			start=scanner.nextInt();
			end=scanner.nextInt();
			num=scanner.nextInt();
			for(int j=start-1;j<end;j++) {
				array[j]=num;
			}
		}
		
		for(int i=0;i<basketNum;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
