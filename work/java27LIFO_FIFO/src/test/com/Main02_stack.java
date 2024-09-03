package test.com;

import java.util.Stack;

public class Main02_stack {
    public static void main(String[] args) {
        System.out.println("hello");

        //스텍에 코인객체를 쌓아보자
        Stack<Coin> st = new Stack<>();
        st.push(new Coin(100));
        st.push(new Coin(1000));
        st.push(new Coin(10000));
        st.push(new Coin(100000));

        System.out.println(st);
        System.out.println(st.size());

        System.out.println(st.pop());

        System.out.println(st.peek());

        //주소값이 달라서 false가 나온다. 따라서 데이터클래스 적용해야 검색됨.
        System.out.println(st.contains(new Coin(1000)));

        System.out.println(st.empty());

    }//end main
}//end class