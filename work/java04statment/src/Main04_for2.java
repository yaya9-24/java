public class Main04_for2 {
    public static void main(String[] args) {
        System.out.println("hello");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 다중for를 사용해서 아래와 같이 출력하기.
        //0 1 2 3 4 5 6 7 8 9
        //0 1 2 3 4 5 6 7 8 9
        //0 1 2 3 4 5 6 7 8 9

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }

        //9*9단 출력하기.
        //2*1=2 2*2=4 ... 2*9=18
        //3*1=3 3*2=6 ... 3*9=27

        for (int i = 2; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            }
            System.out.println();
        }

        //반복문에 label(first,second...) 부착가능.
        first:for (int i = 0; i < 3; i++) {
            second:for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    //if(k==5) continue;
                    System.out.print(k+" ");
                    //if(k==5) break first;
                    if(k==5) break second;
                }
                System.out.println();
            }
            System.out.println();
        }
    } // end main
} // end class
