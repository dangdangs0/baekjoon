import java.util.Scanner;

public class Code2447 {
    static int N;
    static char[][] stars;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        stars=new char[N][N];

        star(0,0,N,false);

        StringBuilder answer=new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                answer.append(stars[i][j]);
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
    public static void star(int x,int y, int N, boolean blank){

        if(blank){
            //빈칸
            for(int i=x;i<x+N;i++){
                for(int j=y;j<y+N;j++){
                    stars[i][j]=' ';
                }
            }
            return;
        }

        if(N==1){
            stars[x][y]='*';
            return;
        }

        int size=N/3;
        //각 블록은 이전 사이즈를 총 9개 들고있는거랑 마찬가지임
        int count=0;

        for(int i=x;i<x+N;i+=size){
            for(int j=y;j<y+N;j+=size){
                count++;
                if(count==5){
                    //공백
                    star(i,j,size,true);
                }
                else{
                    star(i,j,size,false);
                }
            }
        }

    }

}
