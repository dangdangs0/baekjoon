import java.util.Scanner;

public class Code2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[][] array=new int[9][9];
		int max=0;
		int maxi=0;
		int maxj=0;
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				array[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(max<array[i][j]) {
					max=array[i][j];
					maxi=i;
					maxj=j;
				}
			}
		}
		maxi+=1;
		maxj+=1;
		System.out.println(max);
		System.out.println(maxi+" "+maxj);
	}

}
