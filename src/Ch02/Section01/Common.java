package Ch02.Section01;

import java.util.Random;

/**
 * Created on 09.04.2015..
 */
public class Common {
    public static void Exchange(Comparable[] numbers, int firstIndex, int secondIndex){
        Comparable first = numbers[firstIndex];
        Comparable second = numbers[secondIndex];
        numbers[firstIndex] = second;
        numbers[secondIndex] = first;
    }
    public static boolean IsSmaller(Comparable first, Comparable second){
        return first.compareTo(second) < 0;
    }
    public static void PrintArray(Comparable[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static Float[] CreateRandomArray(int size){
        Float[] randomNumbers = new Float[size];

        Random randomGenerator = new Random();
        for (int i = 0; i < size; i++){

            randomNumbers[i] = randomGenerator.nextFloat() * 100;
        }
        return randomNumbers;
    }
}
