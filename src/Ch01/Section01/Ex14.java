package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex14 {
    public static int Lg(int N) {
        if(N <= 1){ return 0;}
        return 1 + Lg(N/2);
    }

    public static void Test01(){
        if(Lg(1) == 0)
        {
            System.out.println("PASS: for N = 1, result: 0");
        }
        else
        {
            System.out.println("FAIL: for N = 1, result: " + Lg(1));
        }
    }
    public static void Test02(){
        if(Lg(2) == 1)
        {
            System.out.println("PASS: for N = 2, result: 1");
        }
        else
        {
            System.out.println("FAIL: for N = 2, result: " + Lg(2));
        }
    }
    public static void Test03(){
        if(Lg(3) == 1)
        {
            System.out.println("PASS: for N = 3, result: 1");
        }
        else
        {
            System.out.println("FAIL: for N = 3, result: " + Lg(3));
        }
    }
    public static void Test04(){
        if(Lg(35) == 5)
        {
            System.out.println("PASS: for N = 35, result: 5");
        }
        else
        {
            System.out.println("FAIL: for N = 35, result: " + Lg(35));
        }
    }
    public static void RunAllTests()
    {
        Test01();
        Test02();
        Test03();
        Test04();
    }
}
