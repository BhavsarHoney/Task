import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Employee obj=new Employee();
        String name,add,mobile;
        System.out.println("enter name");
        name=sc.next(); 
        System.out.println("enter address :");
        add=sc.next();
        System.out.println("enter mobile no :");
        mobile=sc.next();
        obj.SetName(name);
        obj.SetAddress(add);
        obj.SetMobile(mobile);
        System.out.println("Name :" + obj.getName());
        System.out.println("Address :" +obj.getAddress());
        System.out.println("Mobile :"+obj.getMoblie());
        sc.close();
    }


    
}
