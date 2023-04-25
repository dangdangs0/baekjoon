import java.util.Scanner;

public class Code19532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=scanner.nextInt();
		int e=scanner.nextInt();
		int f=scanner.nextInt();
		int x=0, y=0;
		
		if(a==0) {//3y=-1
			if(d==0) {
				if(b>e) {
					x=0;
					y=(c-f)/(b-e);
				}
				else {
					x=0;
					y=(f-c)/(e-b);
				}
			}
			else {
				y=c/b;
				x=(f-e*y)/d;
			}
		}
		else if(b==0) { //x=-1
			if(e==0) {
				if(a>d) {
					y=0;
					x=(c-f)/(a-d);
				}
				else {
					y=0;
					x=(f-c)/(d-a);
				}
			}
			else {
				x=c/a;
				y=(f-d*x)/e;
			}
		}
		else if(d==0) { //y=7;
			y=f/e;
			x=(c-b*y)/a;
		}
		else if(e==0) {
			x=f/d;
			y=(c-a*f/d)/b;
		}
		else {
			int tempa=a;
			a=a*d;
			b=b*d;
			c=c*d;
			d=d*tempa;
			e=e*tempa;
			f=f*tempa;
			
			if(b>e) {
				y=(c-f)/(b-e);
				x=(c-b*y)/a;
			}
			else {
				y=(f-c)/(e-b);
				x=(c-b*y)/a;
			}
		}
		
		System.out.println(x+" "+y);
	}

}
