package Ch01.Section01;

import edu.princeton.cs.introcs.StdOut;

/**
 * Created on 01.03.2015.
 */
public class Ex07 {
    public static void Run_fragmentA(){

        double t = 9.0;
        while(Math.abs(t - 9.0/t) > 0.001)
            t = (9.0/t + t) / 2.0;

        StdOut.printf("%.5f\n", t);
    }
    public static void Run_fragmentB(){

        int sum = 0;
        for (int i=1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;

        StdOut.println(sum);
    }

    public static void Run_fragmentC(){

        int sum = 0;
        for(int i = 1; i < 1000; i *= 2)
            for(int j = 0; j < 1000; j++)
                sum++;

        StdOut.println(sum);
    }
}
