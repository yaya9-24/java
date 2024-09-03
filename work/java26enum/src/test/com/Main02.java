package test.com;

import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("hello...");

        System.out.println(Season_enum.FALL); //toString() 리턴문에 따라 결과가 달라진다.
        System.out.println(Season_enum.FALL.name());
        System.out.println(Season_enum.FALL.ordinal());

        Season_enum[] arr = Season_enum.values();
        System.out.println(Arrays.asList(arr));
    }//end main
}//end class
