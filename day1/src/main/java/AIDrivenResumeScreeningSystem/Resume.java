package AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

// Generic Resume class
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole; // Type of job role this resume is for
    private List<String> skills;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Resume{" + "candidateName='" + candidateName + '\'' + ", jobRole=" + jobRole + ", skills=" + skills + '}';
    }
}
