package test.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("hello");
        //파일에 텍스트 작성하기. output
        //객체의 내용을 파일로 작성하기 - 직렬화 객체만 가능 + ObjectOutputStream
        //컬렉션 배열객체도 저장할 수 있다.
        String fileName = "textList.txt"; // C:\MULTI_EDU_26\java\work\java25input_output

        File file = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            //리스트 컬렉션 생성


            List<TestVO> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                TestVO vo = new TestVO(1+i,"kim"+(1+i),33+1+i);
                list.add(vo);
            }
            oos.writeObject(list);

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