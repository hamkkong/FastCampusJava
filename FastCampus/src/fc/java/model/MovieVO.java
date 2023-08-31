package fc.java.model;

public class MovieVO {
    private String name;
    private String day;
    private String hero;
    private String ganre;
    private int runningTime;
    private int grade;

    public MovieVO(String name, String day, String hero, String ganre, int runningTime,int grade ){  // 생성자 작성 및 초기화
        this.name = name;
        this.day = day;
        this.hero = hero;
        this.ganre = ganre;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    //setter method

    public void setName(String name){
        this.name = name;
    }
    public void setDay(String day){
        this.day = day;
    }
    public void setHero(String hero){
        this.hero = hero;
    }
    public void setGanre(String ganre){
        this.ganre = ganre;
    }
    public void setRunningTime(int runningTime){
        this.runningTime = runningTime;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    // getter Mothod
    public String getName(){
        return name;
    }
    public String getDay(){
        return day;
    }
    public String getHero(){
        return hero;
    }
    public String getGanre(){
        return ganre;
    }
    public int getRunningTime(){
        return runningTime;
    }
    public int getGrade(){
        return grade;
    }
    public String toString(){  // toString 메서드 작성
        return name+"\t"+day+"\t"+hero+"\t"+ganre+"\t"+runningTime+"\t"+grade;
    }
}
