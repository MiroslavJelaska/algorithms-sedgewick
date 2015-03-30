package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex12 {
    public static void Run() {
        int[] a = new int[10];
        for(int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for(int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for(int i = 0; i < 10; i++)
            System.out.println(a[i]);
    }
}
