import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;


public class Code10798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String[] array=new String[5];
		char[][] carray=new char[5][15];
		
		int len=0;
		int max=0;
		int count=0;
		
		for(int i=0;i<5;i++) {
			array[i]=scanner.nextLine();
			len=array[i].length();
			if(max<len) {
				max=len;
			}
			for(int j=0;j<len;j++) {
				carray[i][j]=array[i].charAt(j);
			}
		}
		
		for(int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				if(carray[j][i]=='\0') { //if null
					continue;
				}
				System.out.print(carray[j][i]);
			}
		}

	}

}
