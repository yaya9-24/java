package test.com;

import java.io.Serializable;

//객체를 파일IO하거나 네크워크를 통한 원격지에 전송하고자 할 때는 반드시 직렬화를 해줘야한다.
//객체직렬화 : 인터페이스 Serializable을 상속받으면 된다.
public class TestVO implements Serializable {
    private int num;
    private String name;
    private int age;
    public TestVO(){}

    public TestVO(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
