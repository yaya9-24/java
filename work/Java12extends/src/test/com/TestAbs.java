package test.com;

//추상클래스 - 추상메서드를 포함할 수 있는 클래스
public abstract class TestAbs {

    String name = "kim";
    int age =33;

    public TestAbs(){
        System.out.println("TestAbs()...");
    }

    public void test(){
        System.out.println("TestAbs...test()...");
    }

    //추상메서드 - 메서드 실행블럭없이 선언만 된 메서드
    //상속받는 클래스에서 반드시 오버라이딩해야함.
    public abstract void sleep();
}
