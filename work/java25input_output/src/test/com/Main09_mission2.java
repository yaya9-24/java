package test.com;

import java.io.*;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Main09_mission2 {
    public static void main(String[] args) {
        System.out.println("hello");
        // mission
        //MemberVO 객체를 List에 넣어서 파일로 작성하고
        //해당파일을 읽어들이는 프로그램을 작성해 보세요.
        //파일명 : listmembers.txt
        String fileName = "listmembers.txt";

        File file = new File(fileName);
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);


            List<MemberVO> list=(List<MemberVO>)ois.readObject();
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
        //Main09_mission : Output
        //Main09_mission2 : Input
    }//end main
}//end class