import java.util.Scanner;

public class Code1018 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        String[][] allBoard=new String[N][M];
        int count=(N-8+1)*(M-8+1); //반복 횟수
        String whiteLine="WBWBWBWB";
        String blackLine="BWBWBWBW";
        boolean isNotOnce=true;

        String temp="";
        for(int i=0;i<N;i++){
            temp=scanner.next();
            for (int j=0;j<M;j++){
                allBoard[i][j]=String.valueOf(temp.charAt(j));
            }
        }

        int start=0;
        int line=0;
        int min=0;
        boolean isOdd=false;
        boolean isEven=false;
        int color=0;

        while(count!=0){
            String first="";

            //Case 1. 시작이 "B"부터 일 때 최솟값을 확인
            first="B";
            
            
            if(start%2==0){//왼쪽위에가 짝수
                isOdd=false;
                isEven=true;
            }
            else{//홀수
                isOdd=true;
                isEven=false;
            }

            color = getColor(allBoard, whiteLine, blackLine, start, line, isOdd, isEven, color, first);

            int blackColor=color;


            color=0;
            //Case 2. 시작이 "W"부터 일 때 최솟값을 확인
            first="W";


            if(start%2==0){//왼쪽위에가 짝수
                isOdd=false;
                isEven=true;
            }
            else{//홀수
                isOdd=true;
                isEven=false;
            }

            color = getColor(allBoard, whiteLine, blackLine, start, line, isOdd, isEven, color, first);

            int whiteColor=color;
            int eachMin=0;


            if(whiteColor>blackColor){
                eachMin=blackColor;
            }
            else{
                eachMin=whiteColor;
            }


            if(min==0 && isNotOnce){
                min=eachMin;
                isNotOnce=false;
            }
            else{
                if(min>eachMin){
                    min=eachMin;
                }
            }
            color=0;

            line++;
            if(line+7>=M){
                line=0;
                start++;
                if(start+7>=N){
                    break;
                }
            }
            count--;


        }

        System.out.println(min);

    }

    public static int getColor(String[][] allBoard, String whiteLine, String blackLine, int start, int line, boolean isOdd, boolean isEven, int color, String first) {
        for(int i = start; i< start +8; i++){
            int roopLine=0;
            for(int j = line; j< line +8; j++){
                if(first.equals("W")){//맨 왼쪽 위 칸이 흰색
                    if(isEven){//시작 줄 (0.0일 때)
                        if(i%2==0){//그 행도 짝수면 "W"로 시작
                            if(!String.valueOf(whiteLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }
                        else{ //"B"로 시작
                            if(!String.valueOf(blackLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }

                    } else if (isOdd) {//시작 줄 (1,0) "W"
                        if(i%2==0){//그 다음행 짝수면 "B"로 시작
                            if(!String.valueOf(blackLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }
                        else{ //"W"로 시작
                            if(!String.valueOf(whiteLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }
                    }
                }
                else if(first.equals("B")){ //검정색
                    if(isEven){//시작 줄 (0.0일 때)
                        if(i%2==0){//그 행도 짝수면 "B"로 시작
                            if(!String.valueOf(blackLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }
                        else{ //"B"로 시작
                            if(!String.valueOf(whiteLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }

                    } else if (isOdd) {//시작 줄 (1,0) "W"
                        if(i%2==0){//그 다음행 짝수면 "B"로 시작
                            if(!String.valueOf(whiteLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }
                        else{ //"W"로 시작
                            if(!String.valueOf(blackLine.charAt(roopLine)).equals(allBoard[i][j])){
                                color++;
                            }
                            roopLine++;
                        }
                    }
                }
            }


        }
        return color;
    }
}
