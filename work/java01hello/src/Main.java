public class Main {
    public static void main(String[] args) {
        System.out.println("hello"); //String type
        System.out.println('a'); // char type
        System.out.println(111); // int type
        System.out.println(3.14); // double type
        System.out.println(true); // boolean type

        System.out.println("hello"+"Kim");
        System.out.println(99+88);
        System.out.println("99"+88);

        System.out.print("hello");
        System.out.print("hello\n");
        System.out.print("he\tllo");
        System.out.println();
        System.out.print("kim");

        System.out.printf("hello\n"); // \n은 개행을 해준다.
        System.out.printf("he\tllo"); //  \t는 tab을 해준다.
        System.out.printf("hello");
        System.out.println();

        int a = 10;
        double b = 99.99;
        System.out.println("a:"+a+",b:"+b);
        System.out.println("a:"+a);
        System.out.printf("a:%d,b:%f\n",a,b);
        System.out.printf("a:%d,b:%.2f\n",a,b);
        System.out.printf("a:%d\n",a);

        String name = "kim";
        System.out.println("name:"+name);
        System.out.printf("name:%s\n",name);

        System.out.printf("boolean:%b\n",true); //true
        System.out.printf("boolean:%B\n",true); //TRUE

        System.out.printf("name:%5s,age:%d\n","lee",33);
        System.out.printf("name:%-5s,age:%d\n","lee",33);

        System.out.printf("10진수:%d,%d,%d,%d,%d,%d\n",10,11,12,13,14,15);
        System.out.printf("16진수:%x,%x,%x,%x,%x,%x\n",10,11,12,13,14,15);
        System.out.printf("8진수:%o,%o,%o,%o,%o,%o\n",10,11,12,13,14,15);
        //java에서는 이진수prinf 출력기능은 없다.
        //이진수변환 함수를 사용하면 된다.
        System.out.println(Integer.toBinaryString(10)); //1010
        System.out.println(Integer.toHexString(10)); //a
        System.out.println(Integer.toOctalString(10)); //12





    } // end main

} //end class