package test.com;

import java.util.*;

public class Main05_deque {
    public static void main(String[] args) {
        System.out.println("hello");

        //3.덱(데크) : Deque = Stack + Queue
        //혼합형 : stack의 장점과 queue의 장점을 둘 다 사용할 수 있다.
        //데이터의 추출과 삭제를 앞,뒤로 할 수 있다.
        //기본은 FIFO
        Deque<String> dq = new ArrayDeque<>();

        dq.offer("hello1");
        dq.offer("hello2");
        dq.offer("hello3");
        dq.offer("hello4");

        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.peek()); //hello1
        System.out.println(dq.isEmpty());
        System.out.println(dq.contains("hello3"));

        dq.offerFirst("데크111");
        dq.offerFirst("데크222");
        dq.offerLast("데크333");
        dq.offerLast("데크444");
        System.out.println(dq);

        System.out.println(dq.poll()); //peak()의 대상
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);

        Deque<Integer> dq2 = new ArrayDeque<>();
        dq2.offer(10);
        dq2.offer(100);
        dq2.offer(1000);
        dq2.offer(10000);
        System.out.println(dq2);
        //나머지 출력은 여러분이 해보세요.

        Deque<int[]> dq3 = new ArrayDeque<>();
        dq3.offer(new int[]{11,22,33});
        dq3.offer(new int[]{11,22,33});
        dq3.offerFirst((new int[]{111,222,333}));
        dq3.offerLast((new int[]{444,555,666}));
        System.out.println(dq3);

        for (int[] x : dq3) System.out.println(Arrays.toString(x));

        //각 요소배열의 합을 출력해보자.(stream 사용)
        while (!dq3.isEmpty()){
            System.out.println(Arrays.stream(dq3.poll()).mapToLong(x->x).sum());
        }

    }//end main
}//end class