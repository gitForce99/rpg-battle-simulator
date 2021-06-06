import java.util.*;



public class Job {

    //ArrayList<SpecificAttack> JobSkills;
    ArrayList<Pair<String, Integer>> jobSkills;
    String jobName;
    String jobDescription;


    public Job (String jobNm, ArrayList<Pair<String, Integer>> importedSkills, String jobDesc){
        this.jobName = jobNm;
        this.jobSkills = importedSkills;
        this.jobDescription = jobDesc;

    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ArrayList<Pair<String, Integer>> getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(ArrayList<Pair<String, Integer>> jobSkills) {
        this.jobSkills = jobSkills;
    }
}