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
    }
}
