import java.util.*;



public class Job {

    //ArrayList<SpecificAttack> JobSkills;
    ArrayList<String> jobSkills;
    String jobName;
    String jobDescription;


    public Job (String jobNm, ArrayList<String> importedSkills, String jobDesc, ){
        jobName = jobNm;
        jobSkills = importedSkills;
        jobDescription = jobDesc;

    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ArrayList<String> getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(ArrayList<String> jobSkills) {
        this.jobSkills = jobSkills;
    }
}