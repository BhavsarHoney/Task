import java.util.*;
public class Commpany {
    private String name ;
    private String employee;
    private String teamlead;
    Scanner sc= new Scanner(System.in);
    public Commpany(String Name,String Employee,String Teamlead){
        this.name=Name;
        this.employee=Employee;
        this.teamlead=Teamlead;
    }

    public void SetName(String Name){
        this.name=Name;
    }
    public void SetEmployee(String Employee){
         this.name=Employee;
    }
    public void SetTeamlead(String Teamlead){
            this.teamlead=Teamlead;
    }
    public  String getName(){
        return name;
    }
    public String getEmployee(){
        return employee;    
    }
    public String getTeamlead(){
        return teamlead;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employees : " +employee);
        System.out.println("Lead "+ teamlead);

    }

}
