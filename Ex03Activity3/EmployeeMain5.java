import java.util.Scanner;

public class EmployeeMain5 {
    public static void main(String[]args){
        String name,address,mobile;
        int a =0;
        Employee e=new Employee();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name :");
         name=sc.next();
         System.out.println("Enter Address :") ;
        address=sc.next();
        System.out.println("Enter Mobile");
        mobile=sc.next();
        e.SetName(name);
        e.SetAddress(address);
        e.SetMobile(mobile);
        System.out.println("Employee Details");
        System.out.println("Name :" +e.getName());
        System.out.println("Address " +e.getAddress());
        System.out.println("Mobile :" +e.getMoblie());
        while(a!=4){
            System.out.println("Verify and Update the details:");
            System.out.println("Menu");
            System.out.println("1. Update Employee name");
            System.out.println("2. Update Employee Address");
            System.out.println("3. Update Employee mobile");
            System.out.println("4. All information correct/Exit");
            a=sc.nextInt();
           // a.nextLine();
           switch (a) {
            case 1:System.out.println("Current  Name :" +e.getName());
                   System.out.println("Enter the Name :");
                String Name =sc.next();
                e.SetName(Name);
                break;
                case 2 :
                System.out.println("curreent Address :" +e.getAddress());
                System.out.println("Enter the Address :");
                String Address =sc.next();
                e.SetAddress(Address);
                break;
                case 3:
                    System.out.println("Current Moblie no :" +e.getMoblie());
                    System.out.println("Enter new mobile no :");
                    String Number =sc.next();
                    e.SetMobile(Number);
                    break;
                case 4:
                  System.out.println("The details are :") ;
                  System.out.println("Name :" +e.getName());
                  System.out.println("Address :"+e.getAddress());
                  System.out.println("Mobile :" +e.getMoblie());
                  break;
           
            default:
                 System.out.println("invalid ");
           }

        }

        sc.close();

    }

}
