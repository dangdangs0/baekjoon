import java.util.Scanner;

public class Code1316 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		num=scanner.nextInt();
		
		String word="";
		int count=0;
		
		for(int i=0;i<num;i++) {
			word=scanner.next();
			count = count+group(word);
		}
		
		System.out.println(count);
		
		

	}

	public static int group(String word) {
		int count=0;
		boolean isGroup=false;
		for(int i=0;i<word.length();i++) {
			if(word.length()==1) {
				isGroup=true;
				return 1;
			}
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j)) {
					if(word.charAt(i)==word.charAt(j-1)) {
						isGroup=true;
					}
					else {
						isGroup=false;
						return 0;
					}
				}
				else {
					isGroup=true;
				}
			}
		}
		if(isGroup) {
			count++;
		}
		return count;
	}

}
