package Ch01.Section01;

/**
 * Created on 03.03.2015.
 */
public class Ex28 {
    public int[] RemoveDuplicatesFromSortedArray(int[] array){
        if (array.length == 0){ return new int[0]; }
        int numberOfUniqueNumbers = CountNumberOfUniqueNumbers(array);
        int[] newArray = new int[numberOfUniqueNumbers];

        int currentNumber = array[0];
        int currentIndex = 0;
        newArray[currentIndex] = currentNumber;
        for(int i=1; i < array.length; i++){
            if(currentNumber != array[i]){
                currentNumber = array[i];
                currentIndex = currentIndex + 1;
                newArray[currentIndex] = currentNumber;
            }
        }
        return newArray;
    }
    private int CountNumberOfUniqueNumbers(int[] array){
        if (array.length == 0){ return 0; }

        int numberOfUniqueNumbers = 1;
        int currentNumber = array[0];
        for(int i=1; i < array.length; i++){
            if(currentNumber != array[i]){
                currentNumber = array[i];
                numberOfUniqueNumbers = numberOfUniqueNumbers + 1;
            }
        }
        return numberOfUniqueNumbers;
    }

    public void Test(){
        int[] testArray = new int[]{ 1, 1, 1, 2, 2, 51, 100, 100};
        int[] distinctTestArray = RemoveDuplicatesFromSortedArray(testArray);
        for (int i=0; i<distinctTestArray.length; i++){
            System.out.print(distinctTestArray[i] + ", ");
        }
    }
}
