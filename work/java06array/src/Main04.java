//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //다차원배열 - multi array
        //1.데이터 직접 할당(동적할당)
        int[][] suss = new int[][]{new int[]{11,22,33},new int[]{55,66,77,88}};
        //int[][] suss ={{11,22,33},{44,55,66}}; //생략가능
        for (int i = 0; i < suss[0].length; i++) {
            System.out.print(suss[0][i]+" ");
        }
        System.out.println();
        for (int i = 0; i < suss[1].length; i++) {
            System.out.print(suss[1][i]+" ");
        }
        System.out.println();
        System.out.println("--------------");
        for (int x = 0; x < suss.length; x++) {
            for (int i = 0; i < suss[x].length; i++) {
                System.out.print(suss[x][i]+" ");
            }
            System.out.println();

        }

        System.out.println("--------------");
        //2.데이터 길이를 정해서 지정된 값(기본값)으로 할당(정적할당)
        int[][] arrs = new int[2][];
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        //arrs[0] = new int[5];
        //arrs[1] = new int[7]; // null과 new는 같이 따라다닌다!!
        arrs[0] = new int[]{1,1,1,1,1};
        arrs[1] = new int[]{2,2,2,2,2,2,2};
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        for (int x = 0; x < arrs.length; x++) {
            for (int i = 0; i < arrs[x].length; i++) {
                System.out.print(arrs[x][i]+" ");
            }
            System.out.println();
        }

        int[][] arrs2 = new int[2][4];
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        for (int x = 0; x < arrs2.length; x++) {
            for (int i = 0; i < arrs2[x].length; i++) {
                System.out.print(arrs2[x][i]+" ");
            }
            System.out.println();
        }

        //정적배열과 동적배열 각각 생성
        //1.문자열 2차원배열을 만들고 출력해보세요.
        String[][] strss = new String[2][3];
        strss[0] = new String[]{"kim","lee","han"};
        strss[1] = new String[]{"yang","choi","park"};
        strss[0][0] = "aaa";
        strss[0][1] = "bbb";
        strss[0][2] = "ccc";
        for (int x = 0; x < strss.length; x++) {
            for (int i = 0; i < strss[x].length; i++) {
                System.out.print(strss[x][i]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //strss >>> forEach로 출력하세요.
        for(String[] x:strss){
            for(String i : x){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        String[][] strss2 = new String[][]{{"kim","lee","han"},{"yang","choi","park"}};
        for (int x = 0; x < strss2.length; x++) {
            for (int i = 0; i < strss2[x].length; i++) {
                System.out.print(strss2[x][i]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //2.실수 2차원배열을 만들고 출력해보세요.
        double[][] dss = new double[2][3];
//        dss[0] = new double[]{1.1,1.2,1.3,1.4};
//        dss[1] = new double[]{12.5,54.3,4.0};
        for (int x = 0; x < dss.length; x++) {
            for (int i = 0; i < dss[x].length; i++) {
                System.out.print(dss[x][i]+" ");
            }
            System.out.println();
        }
        double[][] dss2 = new double[][]{{1.1,1.2,1.3,1.4},{12.5,54.3,4.0}};
        for (int x = 0; x < dss2.length; x++) {
            for (int i = 0; i < dss2[x].length; i++) {
                System.out.print(dss2[x][i]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //dss2 >>> forEach로 출력하세요.
        for(double[] x: dss2){
            for (double i : x){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    } //end main
} // end class