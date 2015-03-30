package Ch01.Section01;

import java.util.Hashtable;

/**
 * Created on 02.03.2015.
 */
public class Ex27 {
    public Ex27(int a, int b, double p) {
        this.a = a;
        this.b = b;
        this.p = p;
    }
    public final int a;
    public final int b;
    public final double p;


    public int countOfRecursiveCalls = 0;
    public double binomial(int N, int k, double p){

        countOfRecursiveCalls++;

        if((N == 0) && (k == 0)) return 1.0;
        if((N < 0) || (k < 0)) return 0.0;
        return (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    private int countOfRecursiveCalls_withMemo = 0;
    private Hashtable<String, Double> memo = new Hashtable<String, Double>();
    public double betterBinomial(int N, int k, double p){

        countOfRecursiveCalls_withMemo++;

        if((N == 0) && (k == 0)) return 1.0;
        if((N < 0) || (k < 0)) return 0.0;
        if(memo.get(GenerateKey(N, k, p)) != null){
            return memo.get(GenerateKey(N, k, p));
        }else {
            double value = (1 - p) * betterBinomial(N - 1, k, p) + p * betterBinomial(N - 1, k - 1, p);
            memo.put(GenerateKey(N, k, p), value);
            return value;
        }
    }
    private String GenerateKey(int N, int k, double p){
        return N + "," + k + "," + p;
    }

    public void Test01(){
        System.out.println("Start");

        System.out.println("Binomial of (" + a + ", " + b + ", 0.25): " + binomial(a, b, p));
        System.out.println("Number of recursive calls: " + countOfRecursiveCalls);
    }
    public void Test02(){
        System.out.println("Start");

        System.out.println("Binomial of (" + a + ", " + b + ", 0.25): " + betterBinomial(a, b, p));
        System.out.println("Number of recursive calls: " + countOfRecursiveCalls_withMemo);
    }
}
//http://java67.blogspot.com/2013/02/10-examples-of-hashmap-in-java-programming-tutorial.html