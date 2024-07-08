package test.com;

public class MissionMain {
    public static void main(String[] args) {
        Board[] bd = new Board[5];
        for (int i = 0; i < bd.length; i++) {
            bd[i] = new Board();
        }
        for (int i = 0; i < bd.length; i++) {
            System.out.printf("%d, %s, %s, %s, %s\n"
                    ,bd[i].num,bd[i].title,bd[i].cont,bd[i].name,bd[i].date);
        }

        bd = new Board[5];

        for (int i = 0; i < bd.length; i++) {
            bd[i] = new Board(i+1,"큰제목"+i,"큰내용"+i,"yang"+i+1,"24070"+i+1);
        }

        for (int i = 0; i < bd.length; i++) {
            System.out.printf("%d, %s, %s, %s, %s\n"
                    ,bd[i].num,bd[i].title,bd[i].cont,bd[i].name,bd[i].date);
        }
    } //end main
} //end class
