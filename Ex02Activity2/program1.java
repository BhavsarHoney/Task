import java.util.Scanner;
public class program1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []number= new int[n];
        int sumofodd=0,sumofeven=0;
        if(n<0){
            System.out.println("invalid array size");

        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            number[i]= sc.nextInt();
            if (number[i]<0)
            {
                System.out.println("invalid input");
                return ;
            }
            if(number[i]%2==0){
                sumofeven=sumofeven+number[i];
            }
            else{
                sumofodd=sumofodd+number[i];
            }
            if (number[i]<0)
            {
                System.out.println("invalid input");
            }

        }
        if(sumofodd>sumofeven){
            System.out.println(sumofodd);
        }
        else{
            System.out.println(sumofeven);
        }

    }
    sc.close();
}
}