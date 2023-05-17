import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Code5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.valueOf(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<T;i++){
            StringBuilder p= new StringBuilder(br.readLine());
            int n=Integer.valueOf(br.readLine());
            Deque<Integer> x=new LinkedList<>();
            String array= br.readLine();
            array=array.replace("[","");
            array=array.replace("]","");
            Boolean isFront=true;

            if(array.length()==0){
                String temp="";
                for(int j=0;j<p.length();j++){
                    if(p.charAt(j)=='R'){
                        temp="[]";
                    }
                    else{
                        temp="error";
                        break;
                    }
                }
                sb.append(temp+"\n");
                continue;
            }
            String[] ars=array.split(",");


            for(int j=0;j<ars.length;j++){
                x.add(Integer.valueOf(ars[j]));
            }
            //1 2 3 4

            String tem="";
            //테스트 케이스 준비 완료
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)=='R'){
                    if(isFront){
                        isFront=false;
                    }
                    else{
                        isFront=true;
                    }
                }
                else{
                    //첫번째 수 버림
                    if(x.isEmpty()){
                        tem="error";
                        break;
                    }
                    else{
                        if(isFront){
                            x.poll();//첫번째 수 버림
                        }
                        else{
                            x.pollLast(); //뒤집혀있으니 마지막 수 버림
                        }

                    }
                }
            }

            if(tem.equals("error")){
                sb.append(tem+"\n");
                continue;
            }

            sb.append("[");
            for(int j=0;j<x.size();j++){
                if(isFront){
                    sb.append(x.poll());
                }
                else{
                    sb.append(x.pollLast());
                }
                j=-1;
                if(!x.isEmpty()){
                    sb.append(",");
                }
            }
            sb.append("]"+"\n");

        }
        System.out.print(sb);
    }
}
