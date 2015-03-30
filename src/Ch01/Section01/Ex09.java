package Ch01.Section01;

/**
 * Created on 01.03.2015.
 */
public class Ex09 {
    public static String FromDecToBin_iterativly(int dec){
        String bin = "";
        while(dec != 0)
        {
            bin = (dec%2) + bin;
            dec = (dec/2);
        }
        return bin;
    }
    public static String FromDecToBin_recursively(int dec){
        if(dec == 0) { return ""; }
        return FromDecToBin_iterativly(dec/2) + (dec%2);
    }
}
