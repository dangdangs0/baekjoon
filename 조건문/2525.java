import java.util.Scanner;

public class Code2525 {

	public static void main(String[] args) {
		int hour;
		int min;
		int time;
		
		int nhour=0;
		int nmin=0;
		
		Scanner scanner=new Scanner(System.in);
		hour=scanner.nextInt();
		min=scanner.nextInt();
		time=scanner.nextInt();
		
		nmin=min+time;
		nhour=hour;
		if(nmin>=60) {
			nhour=hour+nmin/60;
			nmin=nmin%60;
			if(nhour==24) {
				nhour=0;
			}
		}
		if(nhour>=24) {
			nhour=nhour-24;
		}
		
		
		System.out.print(nhour +" ");
		System.out.print(nmin);

	}

}
