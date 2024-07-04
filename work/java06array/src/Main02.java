//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        String[] names = new String[]{"kim","lee","han"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //System.out.println(names[3]); //error, 주어진 인덱스만 사용 가능!
        System.out.println("names.length:"+names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for(String x : names){
            System.out.println(x);
        }

        //1.2,2.2,3.3 을 데이터로 하는 배열을 만들고 출력하세요.
        double[] ds = new double[]{1.2,2.2,3.3};

        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }
        for(double x : ds){
            System.out.println(x);
        }
        //a, b, c를 데이터로 하는 배열을 만들고 출력하세요.
        char[] cs = new char[]{'a', 'b', 'c'};

        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }
        for(char x : cs){
            System.out.println(x);
        }
        //true, false, true를 데이터로 하는 배열을 만들고 출력하세요.
        boolean[] bs = new boolean[]{true, false, true};

        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }
        for (boolean x : bs){
            System.out.println(x);
        }
    } //end main
} // end class