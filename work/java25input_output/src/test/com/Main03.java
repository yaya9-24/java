package test.com;

import java.io.*;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        FileReader fr = null;
        BufferedReader br = null;

        //파일의 상대경로를 이용할 수 있다.
        Class<?> clazz = Main03.class;
        String path = clazz.getResource("text.txt").getPath();


        System.out.println(path);
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