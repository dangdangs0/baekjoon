import java.util.Scanner;

public class Code6764 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] depth=new int[4];
        for(int i=0;i<4;i++){
            depth[i]=sc.nextInt();
        }
        if(depth[0]<depth[1] && depth[1]<depth[2] && depth[2]<depth[3]){
            System.out.println("Fish Rising");
        }
        else if(depth[0]>depth[1] && depth[1]>depth[2] && depth[2]>depth[3]){
            System.out.println("Fish Diving");
        }
        else if(depth[0]==depth[1] && depth[1]==depth[2] && depth[2]==depth[3]){
            System.out.println("Fish At Constant Depth");
        }
        else{
            System.out.println("No Fish");
        }
    }
}
