package test.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        FileReader fr = null;
        BufferedReader br = null;

        String path = "C:\\MULTI_EDU_26\\java\\work\\java25input_output\\src\\test\\com\\text.txt";

        //파일의 존재유무체크
        System.out.println(new File(path).exists());
        //파일확인
        System.out.println(new File(path).isFile());
        //디렉토리확인
        System.out.println(new File(path).isDirectory());
        if (new File(path).exists()){
            try {
                fr = new FileReader(path);
                br = new BufferedReader(fr);
                List<String> list = new ArrayList<>();
                while (true){
                    String txt = br.readLine();
                    if (txt==null) break;
                    list.add(txt);
                    System.out.println(txt);
                }
                System.out.println(list);
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

            }//end finally...
        } // end if...
    }//end main
}//end class