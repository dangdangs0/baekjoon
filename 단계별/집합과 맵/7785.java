import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Code7785 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        HashMap<String, String> log=new HashMap<String,String>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            String inout=sc.next();
            log.put(name,inout);

            if(log.get(name).equals("leave")){
                log.remove(name);
            }
        }

        List<String> enterList=new ArrayList<>(log.keySet());
        enterList.sort(Comparator.reverseOrder());
        for(String key:enterList){
            System.out.println(key);
        }
    }
}
