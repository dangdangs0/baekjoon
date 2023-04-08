import java.util.Scanner;

public class Code5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student=new int[30];
		int num=0;
		Scanner scanner=new Scanner(System.in);
		int first=0;
		int second=0;
		int[] no=new int[2];
		
		for(int i=0;i<28;i++) {
			num=scanner.nextInt();
			student[num-1]=1;
		}
		
		for(int i=0;i<30;i++) {
			if(student[i]==0) {
				if(no[0]==0) {
					no[0]=i+1;
				}
				else {
					no[1]=i+1;
				}
			}
		}
		
		if(no[0]>no[1]) {
			System.out.println(no[1]);
			System.out.println(no[0]);
		}
		else {
			System.out.println(no[0]);
			System.out.println(no[1]);
		}

	}

}
