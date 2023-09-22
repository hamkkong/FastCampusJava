package kr.makeresume;

public class Education {
    private String graduationYear;
    private String schoolName;
    private String major;
    private Boolean graduationStatus;

   // public Education(){ } //디폴트 생성자

    public Education(String graduationYear, String schoolName, String major, String graduationStatus) {
        this.graduationYear = graduationYear;
        this.schoolName = schoolName;
        this.major = major;
        this.graduationStatus = Boolean.valueOf(graduationStatus);
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Boolean getGraduationStatus() {
        return graduationStatus;
    }

    public void setGraduationStatus(String graduationStatus) {
        this.graduationStatus = Boolean.valueOf(graduationStatus);
    }

    @Override
    public String toString() {
        return "Education{" +
                "graduationYear=" + graduationYear +
                ", schoolName='" + schoolName + '\'' +
                ", major='" + major + '\'' +
                ", graduationStatus='" + graduationStatus + '\'' +
                '}';
    }
}
