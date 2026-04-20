import java.util.*;

public class Counters {
    public static int countLongerThan ( List < String > in , int n ) {
        class LongerThan {
            boolean ok ( String s ) { return s != null && s . length () > n ; }
        }
        LongerThan lt = new LongerThan () ;
        int count = 0;
        for ( String s : in ) if ( lt . ok ( s ) ) count ++;
        return count ;
    }
}
