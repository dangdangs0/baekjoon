import java.util.Scanner;

public class Code6888 {
    public static void main(String[] args) {
        int unit=60;//주기 (4*3*5)
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();

        while(end>=start){
            System.out.println("All positions change in year "+start);
            start=start+unit;
        }
    }
}
