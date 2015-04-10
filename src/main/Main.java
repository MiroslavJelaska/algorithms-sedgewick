package Main;

import Ch02.Section01.Common;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Float[] numbers = Common.CreateRandomArray(5);
        Common.PrintArray(numbers);

        Ch02.Section01.SelectionSort.Sort(numbers);
        Common.PrintArray(numbers);
    }
}
