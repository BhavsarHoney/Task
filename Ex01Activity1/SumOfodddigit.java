import java.util.Scanner;
public class SumOfodddigit {
    public static void  main(String[] args){
        int N ,sum =0 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        if(a<0||a>32767)
        {
            System.out.println("invalid no");
        }
        else{
           while(a>0){
              N=a%10;
              if(N%2!=0){
                sum=sum+N;
              }
              a=a/10;
           }  
           System.out.println(sum); 
    }
    }

}