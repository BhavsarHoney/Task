import java.util.Scanner;
public class power{
    public static void  main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int N =sc.nextInt();
        int n;
        if(N<0){
            System.out.println("Number is too samll"); 
        }else{
        while(N>1){
            if (N>32767){
                System.out.println("Number too large");
            }
            else if(N%2!=0){
                System.out.println("no");
                break;
            }
            else{
                N=N/2;
                if (N==1){
                    System .out.println("yes");
                }
            }

        }
    }
        
    }
}

