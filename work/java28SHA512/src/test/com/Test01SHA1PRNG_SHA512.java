package test.com;

public class Test01SHA1PRNG_SHA512 {

    public static void main(String[] args) {
        //SHA1PRNG 방식으로 암호화에 필요한 문자열(salt)를 얻고,
        //SHA512 방식으로 비밀번호를 암호화(encrypt)하여 salt와 같이 회원정보에 등록한다.
        //(여기서는 DB연동없이 테스트 로직만 구현함.)
        //그리고나서 로그인시 입력된 아이디로 DB에서 salt를 획득하고
        //입력한 비밀번호와 같이 암호화한 후 DB에 저장된 암호화키와 비교해서 비번검증하는 방법

        //User_pwSHA512 클래스는 salt를 생성해주는 기능과
        //암호화문자열을 생성하는 기능을 갖고 있다.


        //1.insertOK 처리로직
        String password = "hi1234";
        String salt = User_pwSHA512.Salt();
        System.out.println("Salt : "+salt);//디비에 저장-복호화 할때 사용
        //k8C2IX+McOvgwDRYrnjeLw==
        String hex_password = User_pwSHA512.getSHA512(password,salt);//암호화
        System.out.println("암호화 결과1 : "+ hex_password);
        System.out.println("암호화 문자열1 길이 : "+ hex_password.length());
        //c2ba573ac2595ebfac7f94c806b9e6279141057841f03b9b6f82e1cd114505eedabaf0cef9326cf470ff18941b4e780a4a5bf430e9a29bf1e538d37eece99289
        System.out.println();

        //2.loginOK 처리로직
        String login_password = "hi1234";
        String salt_db = salt;//디비에 아이디로 검색해서 salt를 가져왔다고 가정
        System.out.println("salt_db : "+salt_db);
        //k8C2IX+McOvgwDRYrnjeLw==

        String hex_password2 = User_pwSHA512.getSHA512(login_password,salt_db);//복호화
        System.out.println("암호화 결과2 : "+ hex_password2);
        System.out.println("암호화 문자열2 길이 : "+ hex_password2.length());
        //c2ba573ac2595ebfac7f94c806b9e6279141057841f03b9b6f82e1cd114505eedabaf0cef9326cf470ff18941b4e780a4a5bf430e9a29bf1e538d37eece99289

        //아래는 예시
//		vo.setPw(hex_password);
//		MemberVO vo2 = service.loginOK(vo);

    }//end main

}//end class