package test.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        FileReader fr = null;
        BufferedReader br = null;

        //파일에서 읽을내용이 대용량일때 또는 하나의 문자열로 통합하고 싶을때
        String path = "C:\\MULTI_EDU_26\\java\\work\\java25input_output\\src\\test\\com\\text.txt";

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder();
            while (true){
                String txt = br.readLine();
                if (txt==null) break;
                sb.append(txt);
                System.out.println(txt);
            }
            System.out.println(sb.toString());
            System.out.println(sb.toString().length());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }//end main
}//end class