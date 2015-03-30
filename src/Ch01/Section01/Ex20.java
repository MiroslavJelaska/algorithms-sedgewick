package Ch01.Section01;

import edu.princeton.cs.introcs.StdStats;

/**
 * Created on 01.03.2015.
 */
public class Ex20 {
    public static double lnOfNFactorial(int n) {
        if(n == 1) return 0;
        return Math.log(n) + lnOfNFactorial(n-1);
    }

    public static void Run()
    {
        System.out.println("ln(1!): " + lnOfNFactorial(1));
        System.out.println("ln(2!): " + lnOfNFactorial(2));
        System.out.println("ln(3!): " + lnOfNFactorial(3));
        System.out.println("ln(4!): " + lnOfNFactorial(4));
        System.out.println("ln(5!): " + lnOfNFactorial(5));
    }
}
