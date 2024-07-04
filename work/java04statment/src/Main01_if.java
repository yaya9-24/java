//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01_if {
    public static void main(String[] args) {
        System.out.println("hello");
//        args = null;
        System.out.println(args.length); // . 연산자는 왼쪽이 반드시 참조타입이다.
        if (args == null) {
            System.out.println("args==null");
        }

        Integer x = 10;
        System.out.println(x.toString()+99);

        double avg = 77;
        if (avg<=100 && avg >=90) {
            System.out.println("A");
        }else if (avg >=80) {
            System.out.println("B");
        }else if (avg >=70) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    } //end main
} //end class