package Ch01.Section01;

import java.nio.charset.MalformedInputException;

/**
 * Created on 02.03.2015.
 */

public class Ex26 {
    public class IntWrapper{
        public IntWrapper(int number) {
            this.number = number;
        }

        public int number;
    }
    public void Sort(IntWrapper first, IntWrapper second, IntWrapper third){
        int a = first .number,
            b = second.number,
            c = third .number,
            t = 0;

        if(a > b) { t = a; a = b; b = t; }
        if(a > c) { t = a; a = c; c = t; }
        if(b > c) { t = b; b = c; c = t; }

        first .number = a;
        second.number = b;
        third .number = c;
    }

    public void Test(){
        for (int i = 0; i < 100000; i++) {
            int a = (int)(Math.floor(Math.random()*Integer.MAX_VALUE) * Math.pow(-1, Math.floor(Math.random()*2)));
            int b = (int)(Math.floor(Math.random()*Integer.MAX_VALUE) * Math.pow(-1, Math.floor(Math.random()*2)));
            int c = (int)(Math.floor(Math.random()*Integer.MAX_VALUE) * Math.pow(-1, Math.floor(Math.random()*2)));

            IntWrapper f1 = new IntWrapper(a);
            IntWrapper s1 = new IntWrapper(b);
            IntWrapper t1 = new IntWrapper(c);
            Sort(f1, s1, t1);

            IntWrapper f2 = new IntWrapper(a);
            IntWrapper s2 = new IntWrapper(b);
            IntWrapper t2 = new IntWrapper(c);
            ValidSortForChecking(f2, s2, t2);

            if(f1.number == f2.number && s1.number == s2.number && t1.number == t2.number) {
                System.out.println("PASS: for (" + f1.number + ", " + s1.number + ", " + t1.number + ")");
            }
            else {
                System.out.println("FAIL: for (" + f1.number + ", " + s1.number + ", " + t1.number + ")");
                return;
            }
        }
    }
    public void ValidSortForChecking(IntWrapper first, IntWrapper second, IntWrapper third){
        int a = Math.min(first.number, Math.min(second.number, third.number)),
            b = 0,
            c = 0,
            t = 0;

        if(a == first.number) {
            b = Math.min(second.number, third.number);
            c = Math.max(second.number, third.number);
        }
        if(a == second.number) {
            b = Math.min(first.number, third.number);
            c = Math.max(first.number, third.number);
        }
        if(a == third.number) {
            b = Math.min(first.number, second.number);
            c = Math.max(first.number, second.number);
        }

        first .number = a;
        second.number = b;
        third .number = c;
    }
}
