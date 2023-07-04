import java.util.Scanner;

public class Code5575 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            int goH=sc.nextInt();
            int goM=sc.nextInt();
            int goS=sc.nextInt();

            int brH=sc.nextInt();
            int brM=sc.nextInt();
            int brS=sc.nextInt();

            int se=brS-goS;
            if(se<0){
                brM=brM-1;
                se+=60;
            }
            int mi=brM-goM;
            if(mi<0){
                brH-=1;
                mi+=60;
            }
            int ho=brH-goH;
            System.out.println(ho+" "+mi+" "+se);
        }
    }
}

