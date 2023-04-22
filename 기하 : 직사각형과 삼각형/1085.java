import java.util.Scanner;

public class Code1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int x,y,w,h;
		x=scanner.nextInt();
		y=scanner.nextInt();
		w=scanner.nextInt();
		h=scanner.nextInt();
		
		int min=0;
		int[] distance=new int[4];
		
		distance[0]=x;
		distance[1]=y;
		distance[2]=w-x;
		distance[3]=h-y;
		
		min=distance[0];
		
		for(int i=0;i<4;i++) {
			if(min>distance[i]) {
				min=distance[i];
			}
		}
		
		System.out.println(min);
	}

}
