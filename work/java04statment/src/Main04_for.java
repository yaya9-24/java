public class Main04_for {
    public static void main(String[] args) {
        System.out.println("hello");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 40; i < 130; i++) {
            System.out.println(i+" : "+(char)i); //casting을 할 수 있다.
        }

        for (char i = '('; i <= '\u0081'; i++) {
            System.out.println(i+" : "+(int)i); //casting을 할 수 있다.
        }

    } // end main
} // end class
