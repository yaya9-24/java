package test.com;

import java.util.Arrays;
import java.util.Random;

public class Main05Random {
    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(r.nextInt()); //4byte 정수범위내에서
        System.out.println(r.nextInt(5)); //0~4
        System.out.println(r.nextDouble()); //난수발생
        System.out.println(r.nextDouble(100));

        //java css javascript html jsp spring web을 문자배열에 넣으세요.
        //아래함수로 배열을 전달해서 리턴된 문자열을 출력하세요.
        String[] strs = new String[]{"java","css","javascript","html","jsp","spring","web"};
        System.out.println(getRandomString(strs));

        //주사위 3개를 랜덤하게 굴려서 나온 수의 합을 리턴하는 함수를 만들어 출력하세요.
        int sum = getSum();
        System.out.println(sum);
        System.out.println("==============");
        //로또번호 추첨기능 1~45 중에서 6개의 중복되지 않은 수 출력(중복되도 상관없음)
        //6개의 정수를 배열로 리턴받는 메서드 구현하기.
        int[] lotto = getLottoArray();
        System.out.println(lotto);

    } //end main


    //랜덤함수를 이용해서 배열에 들어있는 문자열을 뽑고 리턴하는 함수로 구현.
    public static String getRandomString(String[] strs){
        System.out.println("getRandomString()...");
        System.out.println(strs.length);

        Random r = new Random();
        int index = r.nextInt(strs.length);

        return strs[index];
    }
    public static int getSum(){
        Random r = new Random();
        int first = r.nextInt(6)+1;
        int second = r.nextInt(6)+1;
        int third = r.nextInt(6)+1;
        System.out.printf("%d,%d,%d\n",first,second,third);
        int sum = first + second + third;

        return sum;
    }

    public static int[] getLottoArray(){
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(45)+1;

        }
        Arrays.sort(arr);
        return arr;
    }
}//end class
