import java.util.Scanner;

public class Code2839 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int count=0;
        int temp=N;
        int answer=0;

        while(temp!=0){
            if(temp/5>0){
                count+=temp/5;
                temp=temp%5;
            }
            if(temp/3>0){
                count+=temp/3;
                temp=temp%3;
            }
            if(temp<=2 && temp!=0){
                count=-1;
                break;
            }
        }

        int firstcount=count;
        count=0;

        temp=N;
        while(temp!=0){
            if(temp%3==0){ //3의 배수
                count=temp/3;
                break;
            }
            if(temp%5==0){
                count=temp/5;
                break;
            }
            else{
                count=-1;
                break;
            }
        }
        int secondcount=count;

        count=0;

        temp=N;
        int min=-1;

        if(N>=5){
            while(temp!=0){ //여기가 문제.
                min=-1;
                for(int i=1;i<=N/5;i++){
                    temp=N;
                    if(temp>=5){
                        temp=temp-5*i;
                        count=count+i;

                        if(temp==0){
                            if(min==-1){
                                min=count;
                            }
                            else{
                                if(min>count){
                                    min=count;
                                }
                            }
                            break;
                        }
                    }
                    if(temp%3==0){
                        count+=temp/3;
                        temp=temp%3;
                    }
                    else{
                        temp=temp%3;
                    }
                    if(temp<=2 && temp!=0){
                        count=-1;
                    }


                    if(min==-1){
                        min=count;
                    }
                    else if(count==-1){
                        count=0;
                        continue;
                    }
                    else{
                        if(min>count){
                            min=count;
                        }
                    }
                    min=count;
                    count=0;
                }
                temp=0;
            }
        }

        int thirdcount=min;


        if(secondcount==-1){
            if(thirdcount==-1){
                answer=firstcount;
            }
            else{
                if(firstcount==-1){
                    answer=thirdcount;
                }
                else{
                    if(firstcount<thirdcount){
                        answer=firstcount;
                    }
                    else{
                        answer=thirdcount;
                    }
                }
            }
        }
        else if(firstcount==-1){
            if(thirdcount==-1){
                answer=secondcount;
            }
            else{
                if(secondcount==-1){
                    answer=thirdcount;
                }
                else{
                    if(secondcount<thirdcount){
                        answer=secondcount;
                    }
                    else{
                        answer=thirdcount;
                    }
                }
            }
        }
        else if(thirdcount==-1){
            if(firstcount==-1){
                answer=secondcount;
            }
            else{
                if(secondcount==-1){
                    answer=firstcount;
                }
                else{
                    if(secondcount<firstcount){
                        answer=secondcount;
                    }
                    else{
                        answer=firstcount;
                    }
                }
            }
        }
        else{//다 -1이 아니다..
            if(firstcount<=secondcount){
                if(firstcount>=thirdcount){
                    answer=thirdcount;
                }
                else{
                    answer=firstcount;
                }
            }
            else{
                if(secondcount>=thirdcount){
                    answer=thirdcount;
                }
                else{
                    answer=secondcount;
                }
            }

        }

        System.out.println(answer);
    }
}
