import java.util.Scanner;

public class Employee {
    Scanner sc =new Scanner(System.in) ;
   private String name;
   private String address;
   private String mobile;
   public void SetName(String Name){
    this.name=Name;
   }
    public String getName()
    {
        return name;
    }
     public void SetAddress(String Address){
        this.address=Address;
     }
     public String getAddress(){
        return address;
     }
     public void SetMobile(String Mobile){
        this.mobile=Mobile;
     }
     public String getMoblie(){
        return mobile;
     }
}