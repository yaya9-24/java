package test.com;

import java.io.*;
import java.util.List;

public class Main08 {
    public static void main(String[] args) {
        System.out.println("hello");
        //객체로 저장된 파일읽기 2 : ObjectInputStream
        String fileName = "textList.txt"; // C:\MULTI_EDU_26\java\work\java25input_output

        File file = new File(fileName);
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            List<TestVO> list = (List<TestVO>)ois.readObject();
            System.out.println(list);

            System.out.println("end read....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }//end main
}//end class