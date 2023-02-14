import java.util.Scanner;

public class customermain3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Details");
        String str1[]=sc.nextLine().split(",");
        if (str1.length>3){
            System.out.println("Invalid input");
        } 

        Customer obj= new Customer(str1[0],str1[1],str1[2]);
         
        System.out.println("Name :" +obj.getName());
        System.out.println("Address :"+obj.getAddress());
        System.out.println("Mobile :"+obj.getMobile());

        sc.close();
}
}
