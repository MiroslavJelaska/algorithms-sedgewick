package Ch02.Section01;

/**
 * Created on 09.04.2015..
 */
public class InsertionSort {
    public static void Sort(Comparable[] numbers)
    {
        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++){
            for(int insertionIndex = currentIndex; insertionIndex > 0 &&  Common.IsSmaller(numbers[insertionIndex], numbers[insertionIndex - 1]); insertionIndex--){
                Common.Exchange(numbers, insertionIndex - 1, insertionIndex);
            }
        }
    }
}
