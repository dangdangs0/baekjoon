import java.util.Scanner;

public class Code5357 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        for(int i=0;i<n;i++){
            String s=sc.next();
            s=s.replaceAll("A{2,}","A");
            s=s.replaceAll("B{2,}","B");
            s=s.replaceAll("C{2,}","C");
            s=s.replaceAll("D{2,}","D");
            s=s.replaceAll("E{2,}","E");
            s=s.replaceAll("F{2,}","F");
            s=s.replaceAll("G{2,}","G");
            s=s.replaceAll("H{2,}","H");
            s=s.replaceAll("I{2,}","I");
            s=s.replaceAll("J{2,}","J");
            s=s.replaceAll("K{2,}","K");
            s=s.replaceAll("L{2,}","L");
            s=s.replaceAll("M{2,}","M");
            s=s.replaceAll("N{2,}","N");
            s=s.replaceAll("O{2,}","O");
            s=s.replaceAll("P{2,}","P");
            s=s.replaceAll("Q{2,}","Q");
            s=s.replaceAll("R{2,}","R");
            s=s.replaceAll("S{2,}","S");
            s=s.replaceAll("T{2,}","T");
            s=s.replaceAll("U{2,}","U");
            s=s.replaceAll("V{2,}","V");
            s=s.replaceAll("W{2,}","W");
            s=s.replaceAll("X{2,}","X");
            s=s.replaceAll("Y{2,}","Y");
            s=s.replaceAll("Z{2,}","Z");
            System.out.println(s);
        }
    }
}
