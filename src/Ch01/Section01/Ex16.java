package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex16 {
    public static String exR1(int n){
        if(n <= 0){ return ""; }
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}
