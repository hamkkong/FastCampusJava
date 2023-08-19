public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3편을 저장할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하세요.
        Movie[]m = new Movie[3];
        m[0] = new Movie();
        m[0].mTitle = "A영화";
        m[0].mMajor = "박매일";
        m[0].mLevel = 15;
        m[0].mDay = "2023-01-15";

        m[1] = new Movie();
        m[1].mTitle = "B영화";
        m[1].mMajor = "나길동";
        m[1].mLevel = 12;
        m[1].mDay = "2023-01-11";

        m[2] = new Movie();
        m[2].mTitle = "C영화";
        m[2].mMajor = "조길동";
        m[2].mLevel = 18;
        m[2].mDay = "2022-11-16";
        //반복문
        for(int i=0; i<m.length; i++){
            System.out.println(m[i].mTitle+"\t"+m[i].mMajor+"\t"+m[i].mLevel+"\t"+m[i].mDay);
        }
    }
}
