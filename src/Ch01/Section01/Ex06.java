package Ch01.Section01;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created on 01.03.2015..
 */
public class Ex06 {
    public static void Run()
    {
        int f = 0;
        int g = 0;
        for(int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
