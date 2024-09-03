package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class Main04_queue {
    public static void main(String[] args) {
        System.out.println("hello");

        //Message 객체(command,to)를 큐에 넣어서 사용해보세요.
        Queue<Message> q = new LinkedList<>();
        q.offer(new Message("Send Mail","kim"));
        q.offer(new Message("Send SMS","hong"));
        q.offer(new Message("Send Kakao","yang"));

        System.out.println(q);
        System.out.println(q.size());

//        while (!q.isEmpty()){
//            System.out.println("peek:"+q.peek());
//            System.out.println("poll:"+q.poll());
//            System.out.println(q);
//        }
        //큐에 쌓여있는 개체를 하나하나 처리하는 컨셉으로 반복문 처리
        while (!q.isEmpty()){
            Message msg = q.poll();
            switch (msg.getCommand()){
                case "Send Mail":
                    System.out.println(msg.getTo()+"님에게 이메일전송");
                    break;
                case "Send SMS":
                    System.out.println(msg.getTo()+"님에게 문자메시지전송");
                    break;
                case "Send Kakao":
                    System.out.println(msg.getTo()+"님에게 카톡전송");
                    break;
                default:
                    break;
            }
        }
    }//end main
}//end class