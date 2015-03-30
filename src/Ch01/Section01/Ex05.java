package Ch01.Section01;

/**
 * Created by Miroslav Jelaska on 01.03.2015..
 */
public class Ex05 {
    public static boolean Run(double x, double y)
    {
        return IsInRange(x, 0, 1) && IsInRange(y, 0, 1);
    }
    private static boolean IsInRange(double number, int lower, int upper)
    {
        return (number > lower && number < upper);
    }

    public static void Test01()
    {
        if(Run(0.5, 0.1))
        {
            System.out.println("PASS: for x = 0.5 and y = 0.1");
        }
        else
        {
            System.out.println("FAIL: for x = 0.5 and y = 0.1");
        }
    }
    public static void Test02()
    {
        if(Run(0, 0.1) == false)
        {
            System.out.println("PASS: for x = 0 and y = 0.1");
        }
        else
        {
            System.out.println("FAIL: for x = 0 and y = 0.1");
        }
    }
    public static void Test03()
    {
        if(Run(0.5, 1) == false)
        {
            System.out.println("PASS: for x = 0.5 and y = 1");
        }
        else
        {
            System.out.println("FAIL: for x = 0.5 and y = 1");
        }
    }
    public static void RunAllTests()
    {
        Test01();
        Test02();
        Test03();
    }
}
