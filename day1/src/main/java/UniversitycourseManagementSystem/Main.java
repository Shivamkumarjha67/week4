package UniversityCourseManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Department creation
        Department cse = new Department("CSE");
        Department aiml = new Department("AIML");

        // Course creation
        Course<ExamCourse> javaProgramming = new Course<>("Java Programming");
        javaProgramming.addCourseInstance(new ExamCourse("Java Exam A"));
        javaProgramming.addCourseInstance(new ExamCourse("Java Exam B"));

        Course<AssignmentCourse> dsa = new Course<>("Data Structures and Algorithm");
        dsa.addCourseInstance(new AssignmentCourse("DS Assignment A"));
        dsa.addCourseInstance(new AssignmentCourse("DS Assignment B"));

        Course<ResearchCourse> rocketScience = new Course<>("Rocket Science");
        rocketScience.addCourseInstance(new ResearchCourse("Rocket Science Research Paper"));

        // Adding courses to departments
        cse.addCourse(javaProgramming);
        cse.addCourse(dsa);
        aiml.addCourse(rocketScience);

        // Displaying department offerings
        cse.displayOfferedCourses();
        aiml.displayOfferedCourses();

        // Demonstrating adding a course of a different type to the same department:
        Course<ExamCourse> advancedJava = new Course<>("Advanced Java");
        advancedJava.addCourseInstance(new ExamCourse("Advanced Java Exam"));
        cse.addCourse(advancedJava);
        cse.displayOfferedCourses();
    }
}
