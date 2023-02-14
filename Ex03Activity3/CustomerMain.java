import java.util.Scanner;

public class CustomerMain {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Details");
        String str1=sc.next();
        String[] str2=str1.split(",");
        Customer obj= new Customer();
         
        System.out.println("Name :" +str2[0]);
        System.out.println("Address :"+str2[1]);
        System.out.println("Mobile :"+str2[2]);

        sc.close();
    }
}
