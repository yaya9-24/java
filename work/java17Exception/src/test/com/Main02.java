package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //여러개의 오류 처리를 위한 멀티캐치문

        //try블럭에서 오류가 발생하든 하지않든 상관없이 반드시 수행한느 블럭(finally)
        try {
            System.out.println(Integer.parseInt("a1111"));

            String str = null;
            System.out.println(str.length());


            System.out.println(10 / 0);

            int[][] suss = new int[5][5];
            System.out.println(suss[5][5]);


        } catch (NumberFormatException ex) {
            System.out.println("catch...NumberFormatException");
        } catch (NullPointerException ex) {
            System.out.println("catch...NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("catch...ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException ex) {
            System.out.println("catch...ArithmeticException");
        } catch (Exception ex) {
            System.out.println("catch...Exception");
        }finally {
            System.out.println("finally....");
        }


        System.out.println("end main...");
    }//end main


}//end class
