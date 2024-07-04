public class Main02_switch_case {
    public static void main(String[] args) {
        System.out.println("hello");
        int x = 20;
        //double x =3.14; // 실수타입 사용불가
        switch (x){
            case 10:
                System.out.println("10...");
                break;
            case 20:
                System.out.println("20...");
                break;
            default:
                System.out.println("other...");
                break;
        }

        String key = "java";
        switch(key){
            case "java":
                System.out.println("백엔드...");
                break;
            case "html":
                System.out.println("프론트앤드");
                break;
            default:
                System.out.println("기타...");
        }

        int su1=10,su2=20;
        char c = '-';
        switch(c){
            case '+':
                System.out.println(su1+su2);
                break;
            case '-':
                System.out.println(su1-su2);
                break;
            default:
                System.out.println("잘못입력...");
        }
    } //end main
}// end class
