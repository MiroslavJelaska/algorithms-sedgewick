package Ch01.Section01;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created on 01.03.2015.
 */
public class Ex19 {
    public static long F(int N)
    {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F(N-1) + F(N-2);
    }
    public static void Run()
    {
        for(int N = 0; N < 90; N++) {
            StdOut.println(N + " " + F(N));
        }
    }
}
