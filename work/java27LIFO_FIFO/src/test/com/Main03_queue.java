package test.com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main03_queue {
    public static void main(String[] args) {
        System.out.println("hello");

        //2.Queue

        Queue<Integer> q = new LinkedList<>();
        q.offer(5001);
        q.offer(5002);
        q.offer(5003);
        q.offer(5004);

        System.out.println(q);
        for (Integer x:q) System.out.println(x);
        System.out.println(q.size());
        System.out.println(q.peek()); //5001
        System.out.println(q.isEmpty()); //큐가 비었니?
        System.out.println(q.contains(5003)); //있으면 참

        System.out.println(q.poll()); //처음 들어간 것부터 뽑기
        System.out.println(q);

        while (!q.isEmpty()){
            System.out.println(q.poll());
            System.out.println(q);
        }
        System.out.println("=========================");

        //문자열을 큐에 넣어서 위와 같이 출력해 보세요.
        //kim1,kim2,kim3,kim4
        Queue<String> q2 = new LinkedList<>();
        q2.offer("kim1");
        q2.offer("kim2");
        q2.offer("kim3");
        q2.offer("kim4");

        System.out.println(q2);
        while (!q2.isEmpty()){
            System.out.println(q2.poll());
            System.out.println(q2);
        }
    }//end main
}//end class