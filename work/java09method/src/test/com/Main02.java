package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //MemberVO,MemberDAO
        //방금 수업BoardDAO처럼 MemberDAO에 메서드 정의하고
        //Main02클래스에 출력하는 연습하세요.

        MemberVO mv = new MemberVO();
        MemberDAO dao = new MemberDAO();

        dao.insert();

        int x =909;
        dao.update(88,77);
        dao.update(88,"lee");
        dao.update("han",76);
        dao.update(9087,"id0101","h1234","yang","010-3333-5555");
        dao.update(mv);
        mv = new MemberVO(9087,"id0101","h1234","yang","010-3333-5555");
        dao.update(mv);

        System.out.println("====================");

        int result = dao.delete();
        System.out.println("result:"+result);

        String result2 = dao.delete2();
        System.out.println("result2:"+result2);

        int[] arr = dao.delete3();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String[] arr2 = dao.delete4();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        MemberVO mvo = dao.delete5();
//        System.out.println(mvo.num);
//        System.out.println(mvo.id);
//        System.out.println(mvo.pw);
//        System.out.println(mvo.name);
//        System.out.println(mvo.tel);
        System.out.println(mvo);

        MemberVO[] mvos = dao.delete6();
        for (int i = 0; i < mvos.length; i++) {
//            System.out.println(mvos[i].num);
//            System.out.println(mvos[i].id);
//            System.out.println(mvos[i].pw);
//            System.out.println(mvos[i].name);
//            System.out.println(mvos[i].tel);
            System.out.println(mvos[i]);
        }

        System.out.println("=====================");

        int re = dao.select1(11,22);
        System.out.println("re:"+re);

        re = dao.select2(11,22,33,44);
        System.out.println("re:"+re);

        re = dao.select3(11,22,33,44,55,66,77,88,99);
        System.out.println("re:"+re);

        re = dao.select3(new int[]{11,22,33,44,55,66,77,88,99});
        System.out.println("re:"+re);

        MemberVO[] mvos3 = dao.select4(new MemberVO());
        //print~~~
        for (int i = 0; i < mvos3.length; i++) {
//            System.out.print(mvos3[i].num+" ");
//            System.out.print(mvos3[i].id+" ");
//            System.out.print(mvos3[i].pw+" ");
//            System.out.print(mvos3[i].name+" ");
//            System.out.println(mvos3[i].tel);
            System.out.println(mvos3[i]);
        }

        MemberVO[] mvos4 = dao.select5("searchKey","searchWord");
        //print~~~
        for (int i = 0; i < mvos4.length; i++) {
//            System.out.print(mvos4[i].num+" ");
//            System.out.print(mvos4[i].id+" ");
//            System.out.print(mvos4[i].pw+" ");
//            System.out.print(mvos4[i].name+" ");
//            System.out.println(mvos4[i].tel);
            System.out.println(mvos4[i]);
        }
    }//end main
}//end class
