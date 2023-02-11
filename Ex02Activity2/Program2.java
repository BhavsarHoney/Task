import java.util.Scanner;
public class Program2 {
    public static void main(String[]args){
      Scanner sc =new Scanner(System.in) ;
      System.out.println("Enter the size of array");
      int n= sc.nextInt();
      if(n<0){
        System.out.println("Invalid array size");
        return;
      }
       int a[]=new int[n];
       System.out.println("enter crickter id and score");
      for(int i=0;i<n;i++){
        a[i] =sc.nextInt();
         if(a[i]<0){
          System.out.println("Invalid input");
          return;
         }
      }
      System.out.println("enter score");
      int score =sc.nextInt();
       if(score<0){
        System.out.println("Invalid score");
       }
       for(int j=1;j<n;j+=2){
          if(a[j]>score){
            System.out.println(a[j-1]);
          }
       }
       sc.close();
    }
}
