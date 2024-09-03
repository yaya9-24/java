package test.com;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main07 {

    public static void main(String[] args){
        System.out.println("hello...");

        //텍스트파일을 읽어오는 stream
        String path = "C:\\MULTI_EDU_26\\java\\work\\java24stream\\src\\test\\com\\text.txt";
        try {
            //lines가 해당 파일을 한줄한줄 스트림에 반영해줌
            System.out.println(Files.lines(Paths.get(path), Charset.forName("UTF-8")).toList());

            //데이터들만 출력
            Files.lines(Paths.get(path), Charset.forName("UTF-8")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//end main
}//end class
