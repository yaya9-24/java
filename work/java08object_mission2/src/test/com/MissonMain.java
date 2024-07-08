package test.com;

public class MissonMain {
    public static void main(String[] args) {
        Member[] mbs = new Member[5];
        for (int i = 0; i < mbs.length; i++) {
            mbs[i] = new Member();
        }

        for (int i = 0; i < mbs.length; i++) {
            System.out.printf("번호:%d,아이디:%s,비번:%s,이름:%s,폰번:%s\n"
                    , mbs[i].num, mbs[i].id, mbs[i].pw, mbs[i].name, mbs[i].tel);
        }

        mbs = new Member[5];
        for (int i = 0; i < mbs.length; i++) {
            mbs[i] = new Member(i + 1, "yaya" + (i + 1), "h123" + (i + 1), "yang" + (i + 1), "010-" + i + 1);
        }
        for (int i = 0; i < mbs.length; i++) {
            System.out.printf("번호:%d,아이디:%s,비번:%s,이름:%s,폰번:%s\n"
                    , mbs[i].num, mbs[i].id, mbs[i].pw, mbs[i].name, mbs[i].tel);
        }

        //****미션3.
        //1.프로젝트생성 - java08object_mission3
        //2.package name - test.com
        //3.MissionMain - main method
        //4.Board - member field(번호,아이디,비번,이름,폰번)
        //5.Board생성자-인자없는 생성자, 모든인자 생성자

        //6~7은 메인클래스에서 처리
        //6.반복문을 이용해서 5명의 회원객체를 초기화하고
        //  임의데이터들을 갖는 Board배열에 할당하세요
        //7.반복문을 이용하여 5명의 게시글정보(번호,제목,내용,작성자,작성일자)을 출력
    } //end main
} // end class
