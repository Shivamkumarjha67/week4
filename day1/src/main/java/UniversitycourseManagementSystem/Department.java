package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    // List of courses, using wildcard
    private List<Course<? extends CourseType>> offeredCourses;

    // Parameterized constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.offeredCourses = new ArrayList<>();
    }

    // Method for adding course
    public void addCourse(Course<? extends CourseType> course) {
        offeredCourses.add(course);
    }

    // Getting department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Method for displaying the offered course
    public void displayOfferedCourses() {
        System.out.println("Department: " + departmentName);
        for (Course<? extends CourseType> course : offeredCourses) {
            course.displayCourseInstances();
        }
    }
}
