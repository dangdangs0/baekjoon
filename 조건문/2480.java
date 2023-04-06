import java.util.Scanner;

public class Code2480 {

	public static void main(String[] args) {
		int first,second,third; //save dice number
		int total=0; //price
		int max=0;
		
		Scanner scanner=new Scanner(System.in);
		first=scanner.nextInt();
		second=scanner.nextInt();
		third=scanner.nextInt();
		
		if((first==second)&&(second==third)) { //and
			total=10000+first*1000;
		}
		else if ((first==second)||(second==third)||(first==third)) {
			if(first==second) {
				total=1000+first*100;
			}
			else if(second==third) {
				total=1000+second*100;
			}
			else if(first==third) {
				total=1000+first*100;
			}
		}
		else {
			if(first>third) {
				max=first>second ? first:second;
			 }
			else if(second>third) {
				max=first>second ? first:second;
			}
			else if(third>first) {
				max=third>second ? third:second;
			}
			total=max*100;
		}
		
		System.out.println(total);
	}

}
