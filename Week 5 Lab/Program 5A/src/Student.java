import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String id;
    private String name;
    private List<ICourse> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void enroll(ICourse course) {
        courses.add(course);
    }

    public List<ICourse> getCourses() {
        return courses;
    }
}
