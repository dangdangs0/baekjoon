import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Code26069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashMap<String, Integer> dance=new HashMap<>();
        HashSet<String> name=new HashSet<>();
        int count=0;

        for(int i=0;i<N;i++){
            String a=sc.next();
            String b=sc.next();
            name.add(a);
            name.add(b);


            if(dance.containsKey(a)){//이미 a의 키가 있다.
                if(dance.get(a)==1){//무지개 총총
                    dance.put(b,1);//옆에 애도 무지개
                    continue;
                }
            }
            if(dance.containsKey(b)){//b가 이미 한번 등장
                if(dance.get(b)==1){
                    dance.put(a,1);
                    continue;
                }
            }

            if(a.equals("ChongChong")){
                dance.put(a,1);
                dance.put(b,1);
            }
            else if(b.equals("ChongChong")){
                dance.put(b,1);
                dance.put(a,1);
            }
            else{
                dance.put(a,0);
                dance.put(b,0);
            }
        }

        Iterator iter=name.iterator();
        while(iter.hasNext()){
            if(dance.get(iter.next())==1){
                count++;
            }
        }


        System.out.println(count);
    }
}
