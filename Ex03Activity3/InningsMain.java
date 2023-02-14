import java.util.Scanner;

public class InningsMain {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Innings a = new Innings();
     String  teamname,inningsname,runs;
     System.out.println("Enter the team name");
     teamname=sc.next();
     System.out.println("Enter Session");
     inningsname=sc.next();
     System.out.println("Enter runs");
     runs=sc.next();
     a.SetTeamname(teamname);
     a.SetInningsname(inningsname);
     a.SetRuns(runs);
     System.out.println("Name :" +a.getTeamname());
     System.out.println("Scored:" +a.getRuns());
     a.displayInningsDetails();
    sc.close();
  }
}
