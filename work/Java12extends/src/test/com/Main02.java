package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        p.sleep();
        System.out.println("===1.======");
        //1.Man 이 Person 상속받아서 구현(전역변수 재초기화,오버라이딩)
        Man m = new Man();
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.money);
        System.out.println(m.eye);
        m.sleep();
        m.eat();

        System.out.println("===2.======");
        //2.다형성 객체생성(Person객체생성(Man,익명내부클래스))
        Person p1 = new Man();
        System.out.println(p1.name);
        System.out.println(p1.age);
        p1.sleep();
        Person p2 = new Person(){
            String id="admin";

            public void insert(){
                System.out.println("inner insert()....");
            }

            @Override
            public void sleep() {
                System.out.println("inner sleep()...");
                insert();
            }
        };
        p2.sleep();
        System.out.println("===3.======");
        //3.Student 가 Person 상속받아서 구현(전역변수 재초기화,오버라이딩)
        Student st = new Student();
        System.out.println(st.kor);
        st.study();
        st.sleep();
        System.out.println("=========");
        //4.다형성 객체생성(Person객체생성(Student,익명내부클래스))
        Person p3 = new Student();
        System.out.println(p3.name);
        System.out.println(p3.age);
        p3.sleep();
        Person p4 = new Person(){
            public void sleep(){
                System.out.println("inner sleep()...");
            }
        };
        System.out.println(p4.name);
        System.out.println(p4.age);
        p4.sleep();
    } //end main
} // end class
