import java.util.Scanner;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> pname=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of match");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
        {   String name =sc.next();
			pname .add(name);
        }
		for(String player:pname){
			System.out.println(pname);
            return;
        }
    sc.close();
	}

}