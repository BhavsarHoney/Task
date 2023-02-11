import java.util.Scanner;
public class SalaryCalculation{
public static void  main(String[] args){  
    Scanner sc= new Scanner(System.in);
    int spendsalary,newsalary,shift_salary,total,savings;
      System.out.println("Enter the salary");
      int salary = sc.nextInt();
      System.out.println("Enter the shift");
      int shift =sc.nextInt();
      if(salary>8000){
        System.out.println("salary too large");
      }
      else if(salary<0)
      {
        System.out.println("Salary too small");
      } else if (shift<0){
        System.out.println("shift is too small");
       }else {
        
        spendsalary =salary*50/100;
        //shift_salary=salary*2/100;
        total=spendsalary+(shift*salary*2/100);
        //savings=salary-total;
        System.out.println(total);
      }
} }