import java.util.Scanner;

public class Code2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String word="";
		word=scanner.next();
		
		int count=0;
		int index=0;
		
		String[] alpha= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<alpha.length;i++) {
			while(word.contains(alpha[i])) {
				word=word.replaceFirst(alpha[i], " ");
				count++;
			}
		}
		
		
		word=word.replace(" ", "");
		for(int i=0;i<word.length();i++) {
			count++;
		}
		
		System.out.println(count);
		
	}

}
