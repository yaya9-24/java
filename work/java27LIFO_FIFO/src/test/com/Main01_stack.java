package test.com;

import java.util.Stack;

public class Main01_stack {
    public static void main(String[] args) {
        System.out.println("hello");

        //LIFO - Last In First Out >>Stack 객체
        //FIFO - First In First Out >>Queue 객체

        //1.Stack
        Stack<Integer> st = new Stack<>();
        st.push(5001);
        st.push(5002);
        st.push(5003);
        st.push(5004);

        System.out.println(st);
        for (Integer x:st) System.out.println(x);
        System.out.println(st.size());

        //데이터가 요소에 있는지 검증하기.
        System.out.println(st.contains(5003));


        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.empty()); //stack이 비었는지 확인

        if (!st.empty()){//peek()은 비었을 때 호출하면 예외발생
            System.out.println(st.peek()); //stack의 끝을 확인
        }
        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.empty());


        //문자열을 스텍에 넣어서 위와 같이 출력해 보세요.
        //kim1,kim2,kim3,kim4

        Stack<String> st2 = new Stack<>();

        st2.push("kim1");
        st2.push("kim2");
        st2.push("kim3");
        st2.push("kim4");
        System.out.println(st2);

        System.out.println(st2.pop());
        System.out.println(st2.size());

        System.out.println(st2.pop());
        System.out.println(st2.size());
    }//end main
}//end class