package Ch02.Section01;

/**
 * Created on 09.04.2015..
 */
public class SelectionSort {
    public static void Sort(Comparable[] numbers)
    {
        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++){
            int smallestNumberIndex = FindIndexOfSmallestFromSubarray(numbers, currentIndex);
            if (smallestNumberIndex != currentIndex) {
                Common.Exchange(numbers, currentIndex, smallestNumberIndex);
            }
        }
    }
    private static int FindIndexOfSmallestFromSubarray(Comparable[] array, int fromIndex){
        int smallestNumberIndex = fromIndex;
        for (int i = smallestNumberIndex + 1; i < array.length; i++) {
            if (Common.IsSmaller(array[i], array[smallestNumberIndex])) {
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }
}
