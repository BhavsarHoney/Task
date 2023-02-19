import java.util.Iterator;
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
		
		Iterator<String> set=pname.iterator();
		while (set.hasNext())
            System.out.print(set.next() + " \n");

			System.out.println();
    sc.close();
	}

}