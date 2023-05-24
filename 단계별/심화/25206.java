import java.util.Scanner;

public class Code25206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name="";
		String grade="";
		double time=0;
		double gradenum=0;
		
		int timesum=0;
		double sum=0;
		double gpa=0;
		
		
		
		for(int i=0;i<20;i++) {
			name=scanner.next();
			time=scanner.nextDouble();
			grade=scanner.next();
			
//			System.out.println(name+" "+time+" ");
			
			if(grade.equals("P")) {
				continue;
			}
			else {
				sum=sum+grade(grade)*time;
				timesum+=time;
			}
		}
		
		gpa=sum/timesum;
		
		System.out.println(gpa);
	}

	public static double grade(String grade) {
		double gradenum=0;
		
		switch (grade) {
			case "A+": {
				gradenum=4.5;
				break;
			}
			case "A0": {
				gradenum=4.0;
				break;
			}
			case "B+": {
				gradenum=3.5;
				break;
			}
			case "B0": {
				gradenum=3.0;
				break;
			}
			case "C+": {
				gradenum=2.5;
				break;
			}
			case "C0": {
				gradenum=2.0;
				break;
			}
			case "D+": {
				gradenum=1.5;
				break;
			}
			case "D0": {
				gradenum=1.0;
				break;
			}
			case "F": {
				gradenum=0.0;
				break;
			}
		}
		return gradenum;
	}
}
