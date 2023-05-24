import java.util.Scanner;

public class Code10812 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		int count=0;
		num=scanner.nextInt();
		count=scanner.nextInt();
		
		int[] basket=new int[num];
		int begin=0;
		int end=0;
		int mid=0;
		int temp=0;
		
		for(int i=0;i<num;i++) {
			basket[i]=i+1;
		}
		
		for(int i=0;i<count;i++) {
			begin=scanner.nextInt();
			end=scanner.nextInt();
			mid=scanner.nextInt();
			change(basket, begin, end, mid);
		}
		
		for(int i=0;i<num;i++) {
			System.out.print(basket[i]+" ");
		}
	}

	public static void change(int[] basket, int begin, int end, int mid) {
		int[] temp=new int[basket.length];
		int i=begin-1;
		
		for(int j=0;j<basket.length;j++) {
			temp[j]=basket[j];
		}
		
		for(int k=mid-1;k<end;k++) { //mid..end
			temp[i]=basket[k];
			i=i+1;
		}
		
		for(int k=begin-1;k<mid-1;k++) {
			temp[i]=basket[k];
			i=i+1;
		}
		
		for(int j=0;j<basket.length;j++) {
			basket[j]=temp[j];
		}
		
	}

}
