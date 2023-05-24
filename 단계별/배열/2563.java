import java.util.Scanner;

public class Code2563 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int space=0;
		int x=0;
		int y=0;
		int num=0;
		num=scanner.nextInt();
		
		int[][] paste=new int[100][100];
		
		for(int i=0;i<num;i++) {
			x=scanner.nextInt();//garo
			y=scanner.nextInt();//sero
			
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					paste[j-1][k-1]=1;
				}
			}
			
		}
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(paste[i][j]==1) {
					space++;
				}
			}
		}
		
		System.out.println(space);
	}

}
