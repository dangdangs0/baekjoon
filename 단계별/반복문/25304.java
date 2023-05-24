import java.util.Scanner;

public class Code25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0; //total price
		int num=0 ;//type
		int price=0; //each price
		int count=0; //each number
		int cal=0; //calculate total
		
		Scanner scanner=new Scanner(System.in);
		total=scanner.nextInt();
		num=scanner.nextInt();
		
		for(int i=0;i<num;i++) {
			price=scanner.nextInt();
			count=scanner.nextInt();
			
			cal+=price*count;
		}
		
		if(cal==total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
