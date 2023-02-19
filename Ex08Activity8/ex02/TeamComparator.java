import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

    @Override
    public int compare(Team o1, Team o2) {
        // TODO Auto-generated method stub
        long  T1=o1.getNumberOfMatches();
        long T2=o2.getNumberOfMatches();
    if(T1>T2)
        return 1;
    else if (T1<T2)
        return -1;
    else{
        return 0;
    }
    
    
    }
    
}
