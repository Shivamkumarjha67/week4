import UniversityCourseManagementSystem.Course;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Testing {
    // University management testing
    @Test
    void testUniversityManagement() {
        Course java = new Course("Java");
        assertEquals(java.getCourseName(), "Java");
    }
}
