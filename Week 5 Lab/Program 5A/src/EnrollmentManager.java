import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollmentManager {
    private Map<IStudent, List<ICourse>> enrollments = new HashMap<>();

    public void enroll(IStudent student, ICourse course) {
        enrollments.computeIfAbsent(student, k -> new ArrayList<>()).add(course);
        student.enroll(course);
    }

    public List<ICourse> getEnrolledCourses(IStudent student) {
        return enrollments.getOrDefault(student, new ArrayList<>());
    }
}
