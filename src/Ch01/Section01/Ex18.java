package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex18 {
    public static int mystery(int a, int b){
        if(b == 0) { return 0; }
        if(b % 2 == 0) { return mystery(a + a, b / 2); }
        return mystery(a + a, b / 2) + a;
    }
    public static int mystery2(int a, int b){
        if(b == 0) { return 1; }
        if(b % 2 == 0) { return mystery2(a * a, b / 2); }
        return mystery2(a * a, b / 2) * a;
    }

    public static void Test01()
    {
        for (int i=1; i<= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                if (i * j == mystery(i, j)) {
                    System.out.println("PASS: " + i + "*" + j + " : " + (i * j));
                } else {
                    System.out.println("FAIL: " + i + "*" + j + " : " + mystery(i, j));
                }
            }
        }
    }
    public static void Test02()
    {
        for (int i=1; i<= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                if (i * j == mystery2(i, j)) {
                    System.out.println("PASS: " + i + "*" + j + " : " + (i * j));
                } else {
                    System.out.println("FAIL: " + i + "*" + j + " : " + mystery2(i, j));
                }
            }
        }
    }
}
