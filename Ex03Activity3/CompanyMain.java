import java.util.Scanner;

public class CompanyMain {
    public static void main(String[]args){
    String teamlead,employee,cname;
    Commpany c;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the commpany Name");
    cname=sc.next();
    System.out.println("Enter the Employees");
    employee=sc.next().toLowerCase();
    //String[]str=employee.split(",");
     System.out.println("Enter Teamlead");
     teamlead=sc.next().toLowerCase();
     for (String str:employee.split(",")){

        if (str.equals(teamlead))
        {
            c=new Commpany(cname, employee, teamlead);
            c.displayDetails();
            return;
        }
        else{
          System.out.println("Invalid : ");
          break;
        } 
    }


     
     sc.close();
    }
    }

