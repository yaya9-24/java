package test.com;

public class MemberOuter {

    String name = "kim";
    static String title = "java";

    MemberOuter(){
        new Inner().work();
    }

    //일반 내부클래스
    class Inner extends Father implements Mother{
        int kor = 10;
        int eng = 99;
        //static int math =88; //jdk 17이상부터 사용가능
        void test(){
            System.out.println("test()..."+name);
            System.out.println("title");
        }

        @Override
        public void work() {
            System.out.println("work()...");
        }

        @Override
        public void play() {
            System.out.println("play()...");
        }
    }

    //static내부클래스
    static class StaticInner{
        static int kor =10;
        static int eng = 99;
        static void start(){
            System.out.println("start()...");
            System.out.println(title);
        }
    }
}
