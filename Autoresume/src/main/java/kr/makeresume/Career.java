package kr.makeresume;

public class  Career {  // 경력 관련 클래스
    private String workPeriod;
    private String companyName;
    private String jobTitle;
    private String employmentYears;

    public Career(){ } // 디폴트 생성자

    public Career(String workPeriod, String companyName, String jobTitle, String employmentYears) {
        this.workPeriod = workPeriod;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.employmentYears = employmentYears;
    }

    public String getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(String workPeriod) {
        this.workPeriod = workPeriod;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentYears() {
        return employmentYears;
    }

    public void setEmploymentYears(String employmentYears) {
        this.employmentYears = employmentYears;
    }

    @Override
    public String toString() {
        return "Career{" +
                "workPeriod='" + workPeriod + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employmentYears='" + employmentYears + '\'' +
                '}';
    }
}
