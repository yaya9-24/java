package test.com;

public enum Season_enum {
    //상수(설명추가가능) : 전역변수 + 인자있는 생성자 추가 필요
    SPRING("3월~5월"),SUMMER("6월~8월"),FALL("9월~11월"),WINTER("12월~2월");

    Season_enum(){
        //생성자 : public 선언 안 됨.
    }

    private String season;

    Season_enum(String season){
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
//        return "Season_enum{" +
//                "season='" + season + '\'' +
//                '}';
        return season;
    }
}
