import java.util.Scanner;

public class Code2738 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int first=0;
		int second=0;
		first=scanner.nextInt();
		second=scanner.nextInt();
		
		int[][] farray=new int[first][second];
		int[][] sarray=new int[first][second];
		int[][] tarray=new int[first][second];
		
		for(int i=0;i<first;i++) {
			for(int j=0;j<second;j++) {
				farray[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<first;i++) {
			for(int j=0;j<second;j++) {
				sarray[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<first;i++) {
			for(int j=0;j<second;j++) {
				tarray[i][j]=farray[i][j]+sarray[i][j];
			}
		}
		
		for(int i=0;i<first;i++) {
			for(int j=0;j<second;j++) {
				System.out.print(tarray[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
