package AIDrivenResumeScreeningSystem;


// Abstract base class for Job Roles
abstract class JobRole {
    private String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "JobRole{" + "title='" + title + '\'' + '}';
    }
}