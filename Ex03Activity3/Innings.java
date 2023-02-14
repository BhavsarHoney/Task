import java.util.Scanner;

public class Innings {
    Scanner sc =new Scanner(System.in);
    private String teamname;
    private String inningsname;
    private String runs;
    public void SetTeamname(String Teamname){
        this.teamname=Teamname;
    }
    public void SetInningsname(String Inningsname){
        this.inningsname=Inningsname;
    }
    public void SetRuns(String Run){
        this.runs=Run;
    }
    public String getTeamname(){
        return  teamname;
    }
    public String getInnigsname(){
       return inningsname;
    }
    public String getRuns(){
        return runs;
    }
       public void  displayInningsDetails(){
        if(inningsname.equals("First")){
            System.out.println("Need" +(runs+1)+"to win");
        }
        else if(inningsname.equals("second")){
            System.out.println("Mathch Ended");
        }
        else{
            System.out.println("invalid input");
        }

       }
}
