package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex15 {
    public static int[] Histogram(int[] input, int histogramLength)
    {
        int[] histogram = new int[histogramLength];
        for (int i = 0; i < input.length; i++){
            if (input[i] > 0 && input[i] < histogramLength) {
                histogram[input[i]] = histogram[input[i]] + 1;
            }
        }
        return  histogram;
    }
    private static int CountOccurrences(int[] histogram){
        int count = 0;
        for (int i = 0; i < histogram.length; i++) {
            count = count + histogram[i];
        }
        return count;
    }

    public static void Test01() {
        int[] testInput = new int[]{
            1,   1, 1, 2, 40,
            50, 34, 3, 5,  5,
            3, 4, 7, 2, -1  };

        int[] histogram = Histogram(testInput, 5);
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + " : " + histogram[i]);
        }
    }
    public static void Test02(){
        int[] testInput = new int[]{
                1, 1, 1, 2, 2,
                4, 4, 5,};

        int[] histogram = Histogram(testInput, 6);
        if(CountOccurrences(histogram) == testInput.length){
            System.out.println("PASS: CountOccurrences(histogram) == testInput");
        }
        else {
            System.out.println("FAIL: CountOccurrences(histogram) == testInput");
        }
    }
    public static void RunAllTests(){
        Test01();
        Test02();
    }
}
