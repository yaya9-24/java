package test.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main09_mission {
    public static void main(String[] args) {
        System.out.println("hello");
        // mission
        //MemberVO 객체를 List에 넣어서 파일로 작성하고
        //해당파일을 읽어들이는 프로그램을 작성해 보세요.
        //파일명 : listmembers.txt
        String fileName = "listmembers.txt";

        File file = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            List<MemberVO> list = new ArrayList<>();
            for (int i = 1; i < 4; i++) {
                MemberVO vo = new MemberVO(i,"admin"+i,"hi123"+i,"kim"+i,"010-"+i);
                list.add(vo);
            }
            oos.writeObject(list);

            oos.flush();
            System.out.println("end print....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
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
        //Main09_mission : Output
        //Main09_mission2 : Input
    }//end main
}//end class