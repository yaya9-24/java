package test.com;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");
        //파일에 텍스트 작성하기. output
        String fileName = "hello.txt"; // C:\MULTI_EDU_26\java\work\java25input_output

        File file = new File(fileName);
        FileOutputStream fos = null;
        PrintStream ps = null;

        try {
            fos = new FileOutputStream(file);
            ps = new PrintStream(fos);

            //배열이나 컬렉션에 있는 내용을 작성하기
            List<String> list = Arrays.asList("Hello","java","web");
            for (String x:list){
                ps.println(x);
            }

            //아무거나 작성하기
            ps.printf("%d,%f,%s\n",100,3.14,"kim");
            ps.print("web01");
            ps.print("web02");
            ps.flush();
            System.out.println("end print....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (ps!=null){
                ps.close();
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }//end main
}//end class