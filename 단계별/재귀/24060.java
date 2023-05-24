import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code24060 {
    static int count=0;
    static int K=0;
    static int answer=-1;
    static int[] arr,tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int size=Integer.valueOf(st.nextToken());
        K=Integer.valueOf(st.nextToken());

        st=new StringTokenizer(br.readLine());

        arr=new int[size];
        tmp=new int[size];
        br.close();
        for(int i=0;i<size;i++){
            arr[i]=Integer.valueOf(st.nextToken());
        }

        merge_sort(arr,0,size-1);
        System.out.println(answer);

    }

    public static void merge_sort(int[] A,int p,int r){
        int q;
        if(p<r){
            q=(p+r)/2;
            merge_sort(A,p,q);
            merge_sort(A,q+1,r);
            merge(A,p,q,r);
        }
    }
    public static void merge(int[] A,int p,int q, int r){
        int i=p;
        int j=q+1;
        int t=0;
        int len=A.length;
        while(i<=q && j<=r){
            if(A[i]<=A[j]){
                tmp[t++]=A[i++];
            }
            else{
                tmp[t++]=A[j++];
            }
        }

        while(i<=q){
            tmp[t++]=A[i++];
        }
        while(j<=r){
            tmp[t++]=A[j++];

        }
        i=p;
        t=0;
        while(i<=r){
            A[i++]=tmp[t++];
            count++;
            if(count==K){
                answer=tmp[t-1];
                break;
            }
        }
    }
}
