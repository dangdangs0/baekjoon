import java.util.Scanner;

public class Code2675 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		num=scanner.nextInt();
		
		int roop=0;
		String string;
		String[] out=new String[num];
		
		for(int i=0;i<num;i++) {
			roop=scanner.nextInt(); //roop count
			string=scanner.next();
			for(int j=0;j<string.length();j++) {
				for(int k=0;k<roop;k++) {
					if(out[i]==null) {
						out[i]=String.valueOf(string.charAt(j));
					}
					else {
						out[i]=out[i]+string.charAt(j);
					}
				}
				
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(out[i]);
		}

	}

}
