import java.util.Scanner;

public class Code9063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		
		int x=0,y=0;
		int[][] dots=new int[N][2];
		int minx=0,miny=0,maxx=0,maxy=0;
		int findx=0, findy=0;
		boolean isLinex=false, isLiney=false;

		
		for(int i=0;i<N;i++) {
			x=scanner.nextInt();
			y=scanner.nextInt();
			
			dots[i][0]=x;
			dots[i][1]=y;
		}
		
		findx=dots[0][0];
		findy=dots[0][1];
		for(int i=1;i<N;i++) {
			if(findx!=dots[i][0]) { //한번이라도 다르면 괜찮음
				isLinex=false;
				break;
			}
			else {
				isLinex=true;
			}
		}
		for(int i=1;i<N;i++) {
			if(findy!=dots[i][1]) { //한번이라도 다르면 괜찮음
				isLiney=false;
				break;
			}
			else {
				isLiney=true;
			}
		}
		
		minx=dots[0][0];
		maxx=dots[0][0];
		miny=dots[0][1];
		maxy=dots[0][1];
		if(isLinex || isLiney) {
			
			System.out.println(0);
			
		}
		else {
			
			for(int i=1;i<N;i++) {
				if(minx>dots[i][0]) {
					minx=dots[i][0];
				}
				if(miny>dots[i][1]) {
					miny=dots[i][1];
				}
				if(maxx<dots[i][0]) {
					maxx=dots[i][0];
				}
				if(maxy<dots[i][1]) {
					maxy=dots[i][1];
				}
				
			}
			
			System.out.println((maxx-minx)*(maxy-miny));
		}
	}

}
