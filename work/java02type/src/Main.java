//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        //1. 기본타입(8개) - 숫자관련 타입들, 참거짓
        //byte, short, int, long, float, double, boolean
        //char - 0포함 양의정수 + 문자 하나

        //byte - 1byte : 정수(0,양수,음수) 1000 0000 ,0000 0000
        System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        byte bt = 127;
        System.out.println(bt);
        System.out.println(Integer.toBinaryString(bt));
        System.out.println(++bt);
        System.out.println(Integer.toBinaryString(bt));
        System.out.println(++bt);
        System.out.println(Integer.toBinaryString(bt));

        //short - 2byte 정수 : 0000 0000 0000 0000
        System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        short st = 32767;
        System.out.println(st);
        System.out.println(++st);
        System.out.println(++st);

        //int - 4byte 정수 : 0000 0000 * 4
        //자바의 기본정수타입
        System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        int i = 2147483647;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(++i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(++i);
        System.out.println(Integer.toBinaryString(i));
        //long - 8byte 정수 : 0000 0000 * 8
        //기본정수int와 구분하기 위해서 또는 int범위값을 벗어날때 L을 추가표기
        System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
        long l = 9223372036854775807L;
        System.out.println(l);
        System.out.println(++l);
        System.out.println(++l);

        //boolean - 1byte : true, false
        System.out.println(Boolean.FALSE+","+Boolean.TRUE);
        boolean bool = true;
        System.out.println(bool);
        System.out.println(!bool);

        //float - 4byte
        //실수의 기본타입double과 구분하기 위해 f를 표기추가.
        System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
        float f = 3.14f;
        System.out.println(f);

        //double - 8byte
        //실수의 기본타입
        System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
        double d = 3.14;
        System.out.println(d);

        //char - 2byte, 0 ,양수
        System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
        char c = 65;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(++c);

        char c2 = 'A';
        System.out.println(c2);
        System.out.println((int)c2);


        //2. 참조타입(무한대) - new연산자로 주소를 생성할 수 있는 모든타입.
        //문자열, 배열, 객체
        String name = "kim";
        String name2 = new String("kim"); //new String은 생략할 수 있다.
        System.out.println(name);
        System.out.println(name2);

//        let arr = ["kim","lee","han"];
        String[] names = new String[]{"kim","lee","han"};
        names = new String[]{"kim","lee","han"};
        System.out.println(names);

        int[] sus = new int[]{11,22,33}; // new int는 생략할 수 있다. 하지만 배열에는 쓰기를 권장
        sus = new int[]{11,22,33};
        System.out.println(sus);

        String txt = "99";
        System.out.println(txt + 88);
        System.out.println(Integer.parseInt(txt) + 88); // 무조건 외우기

        txt = "3.14";
        System.out.println(txt+3.14);
        System.out.println(Double.parseDouble(txt)+3.14); // 무조건 외우기

        // 타입별 기본값(default value)
        // byte, short, char, int, long = 0
        // boolean = false
        // float, double = 0.0f, 0.0
        // 참조타입 = null(new연산이 발생되기 전 메모리주소가 없는 상태)

        //자주쓰는 char 정리 - 0~9,a-z,A-Z,+,-,*,/
        System.out.println((int)'0');
        System.out.println((int)'a');
        System.out.println((int)'A');

        for (int x = 40; x < 200; x++) {
            System.out.println((char)x+" ");
        }

    } //end main
} //end class