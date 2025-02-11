package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private String courseName;
    private List<T> courseInstances; // List of specific course instances

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseInstances = new ArrayList<>();
    }

    public void addCourseInstance(T courseInstance) {
        courseInstances.add(courseInstance);
    }

    public String getCourseName() {
        return courseName;
    }

    public List<T> getCourseInstances() {
        return courseInstances;
    }

    public void displayCourseInstances() {
        System.out.println("Course: " + courseName);
        for (T instance : courseInstances) {
            System.out.println("  - " + instance);
        }
    }
}
