package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex11 {
    public static void Print2DBooleanArray(boolean[][] array)
    {
        System.out.print(" ");
        for(int i = 0; i < array[0].length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.print(i);

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == true) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public static void Test()
    {
        boolean[][] array = new boolean[4][5];
        array[0] = new boolean[5];
        array[1] = new boolean[5];
        array[2] = new boolean[5];
        array[3] = new boolean[5];

        array[0][4] = true;
        array[2][4] = true;
        array[1][3] = true;

        Print2DBooleanArray(array);
    }
}
