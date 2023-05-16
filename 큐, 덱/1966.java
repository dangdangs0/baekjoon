import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Code1966 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        Boolean isLoop=true;
        Queue<Integer> priority;
        Queue<Integer> sequence;

        for(int i=0;i<T;i++){
            priority=new LinkedList<>();
            sequence=new LinkedList<>();
            isLoop=true;
            int count=1;
            int size=sc.nextInt();//총 4개
            int find=sc.nextInt()+1;//2번 인덱스 ,, 값은 3이다.

            for(int j=0;j<size;j++){
                priority.add(sc.nextInt());//1 2 3 4
                sequence.add(j+1);
            }
            ArrayList<Integer>big=new ArrayList<>(priority);
            int max=0;
            for(int j=0;j<big.size();j++){
                if(big.get(j)>=max){
                    max=big.get(j);
                }
            }

            while(isLoop){
                while(max>priority.peek()){
                    if(max>priority.peek()){//1이니까 max는 9고
                        int temp= priority.poll();
                        priority.add(temp);
                        int t=sequence.poll();
                        sequence.add(t);
                        //911111 과 345612로 순서 바꿔줌. 우리가 찾아야 하는건 1
                    }
                }
                if(sequence.peek()==find){
                    //우리가 찾는 애랑 같으면
                    System.out.println(count);
                    isLoop=false;
                    break;
                }
                else{
                    count++;
                    sequence.poll();
                    priority.poll();
                }

                max=0;
                ArrayList<Integer>a=new ArrayList<>(priority);
                for(int j=0;j<a.size();j++){
                    if(a.get(j)>=max){
                        max=a.get(j);
                    }
                }


            }


        }
    }
}
