package test.com;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");
        //파일에 텍스트 작성하기. output
        //객체의 내용을 파일로 작성하기 - 직렬화 객체만 가능 + ObjectOutputStream
        String fileName = "textvo.txt"; // C:\MULTI_EDU_26\java\work\java25input_output


        File file = new File(fileName);
        FileOutputStream fos = null;
        //PrintStream ps = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
           // ps = new PrintStream(fos);
            oos = new ObjectOutputStream(fos);

            //객체생성
            TestVO vo = new TestVO(1,"kim",33);

            oos.writeObject(vo);

            //ps.flush();
            oos.flush();
            System.out.println("end print....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
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