
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Code2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int M=scanner.nextInt();
		int max=0;
		int sum=0;
		int[] cards=new int[N];
		int[] maxs=new int[N];
		
		
		for(int i=0; i<N;i++) {
			cards[i]=scanner.nextInt();
		}
		
		Arrays.sort(cards);
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					sum=cards[i]+cards[j]+cards[k];
					
					if(sum<=M) {
						if(max==0) {
							max=sum;
						}
						else if(max<sum) {
							max=sum;
						}
					}
				}
			}
			maxs[i]=max;
		}
		
		Integer[] maxArr=Arrays.stream(maxs).boxed().toArray(Integer[]::new);
		Arrays.sort(maxArr,Comparator.reverseOrder());
		
		System.out.println(maxArr[0]);
	}

}
