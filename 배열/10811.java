import java.util.Scanner;

public class Code10811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int basketNum=0;
		int count=0;
		int first=0;
		int second=0;
		
		basketNum=scanner.nextInt();
		count=scanner.nextInt();
		
		int[] array=new int[basketNum];
		int[] narray=new int[basketNum];
		
		for(int i=0;i<basketNum;i++) {
			array[i]=i+1;
		}
		
		for(int j=0;j<basketNum;j++) {
			narray[j]=array[j];
		}
		
		for(int i=0;i<count;i++) {
			first=scanner.nextInt();
			second=scanner.nextInt();
			
			for(int j=first-1;j<second;j++) {
				for(int k=0;k<=second-first;k++) {
					narray[second-1-k]=array[first-1+k];
				}
			}
			
			for(int j=0;j<basketNum;j++) {
				array[j]=narray[j];
			}
		}
		
		for(int i=0;i<basketNum;i++) {
			System.out.print(array[i]+" ");
		}
	
	}

}
