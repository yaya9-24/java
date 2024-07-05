package test.com;

public class Student {
    int num;
    String name;
    int kor;
    int eng;
    int math;

    public Student() {
        num = 0053;
        name = "yang";
        kor = 99;
        eng = 88;
        math = 77;
    }

    public Student(int num, String name, int kor, int eng, int math) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
