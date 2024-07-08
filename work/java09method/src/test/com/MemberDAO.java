package test.com;

public class MemberDAO {

    public void insert() {
        System.out.println("insert()...");
    }

    public void update(int x) {
        System.out.println("update()...x:"+x);
    }
    public void update(int x,int y) {
        System.out.println("update()...x:"+x+",y:"+y);
    }
    public void update(int x,String y) {
        System.out.println("update()...x:"+x+",y:"+y);
    }
    public void update(String x,int y) {
        System.out.println("update()...x:"+x+",y:"+y);
    }
    public void update(int num,
    String id,
    String pw,
    String name,
    String tel) {
        System.out.println("update(AllArgus)...");
        System.out.println(num);
        System.out.println(id);
        System.out.println(pw);
        System.out.println(name);
        System.out.println(tel);
    }
    public void update(MemberVO mv){
        System.out.println("update()...mv:"+mv);
//        System.out.println(mv.num);
//        System.out.println(mv.id);
//        System.out.println(mv.pw);
//        System.out.println(mv.name);
//        System.out.println(mv.tel);
        System.out.println(mv.toString());
        System.out.println(mv);
    }

    public int delete(){
        System.out.println("delete1()...");
        int x = 99;
        return x;
    }

    public String delete2(){
        System.out.println("delete2()...");
        String x = "kim";
        return x;
    }

    public int[] delete3(){
        System.out.println("delete3()...");
        int[] sus = new int[3];
        return sus;
    }

    public String[] delete4(){
        System.out.println("delete4()...");
        String[] arr = new String[5];
        return arr;
    }

    public MemberVO delete5() {
        System.out.println("delete5()...");
        MemberVO mvo = new MemberVO(22,"aaa","bbb","ccc","ddd");
        return mvo;
    }

    public MemberVO[] delete6() {
        System.out.println("delete6()...");
        MemberVO[] mvos = new MemberVO[3];
        for (int i = 0; i < mvos.length; i++) {
            mvos[i] = new MemberVO();
        }
        return mvos;
    }

    public int select1(int x,int y){
        System.out.println("select1()...");
        return 1;
    }
    public int select2(int x1,int x2,int x3,int x4){
        System.out.println("select2()...");
        return x1+x2+x3+x4;
    }
    public int select3(int ...arr){
        System.out.println("select3()...");
        System.out.println(arr);
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum +=arr[i];
        }
        return sum;
    }
    public MemberVO[] select4(MemberVO mv) {
        System.out.println("select4()...");
        System.out.println(mv);
//        System.out.println(mv.num);
//        System.out.println(mv.id);
//        System.out.println(mv.pw);
//        System.out.println(mv.name);
//        System.out.println(mv.tel);

        MemberVO[] mvos= new MemberVO[3];
        for (int i = 0; i < mvos.length; i++) {
            mvos[i] = new MemberVO(10,"aaa","bbb","ccc","ddd");
        }
        return mvos;
    }
   public MemberVO[] select5(String searchKey, String searchWord) {
        System.out.println("select5()...");
        System.out.println(searchKey);
        System.out.println(searchWord);

        MemberVO[] mvos= new MemberVO[3];
        for (int i = 0; i < mvos.length; i++) {
            mvos[i] = new MemberVO(77,"aaa","bbb","ccc","ddd");
        }
        return mvos;
    }
}//end class
