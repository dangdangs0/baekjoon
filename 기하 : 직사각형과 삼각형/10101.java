import java.util.Scanner;

public class Code10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] angle=new int[3];
		int total=0;
		
		for(int i=0;i<3;i++) {
			angle[i]=scanner.nextInt();
			total=total+angle[i];
		}
		
		if(total==180) {
			if(angle[0]==angle[1]){
				if(angle[0]==angle[2]) {
					System.out.println("Equilateral");
				}
				else {
					System.out.println("Isosceles");	
				}
			}
			else if(angle[1]==angle[2]) {
				System.out.println("Isosceles");	
			}
			else if(angle[0]==angle[2]) {
				System.out.println("Isosceles");
			}
			else {
				System.out.println("Scalene");
			}
			
		}
		else {
			System.out.println("Error");
		}
	}

}
