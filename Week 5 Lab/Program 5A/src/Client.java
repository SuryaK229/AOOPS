public class Client {
    public static void main(String[] args) {
        IStudent student1 = new Student("001", "Alice");
        IStudent student2 = new Student("002", "Bob");

        ICourse course1 = new Course("C001", "Math");
        ICourse course2 = new Course("C002", "Science");

        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student1, course2);
        enrollmentManager.enroll(student2, course2);

        System.out.println(student1.getName() + " is enrolled in:");
        for (ICourse course : enrollmentManager.getEnrolledCourses(student1)) {
            System.out.println(course.getCourseName());
        }

        System.out.println(student2.getName() + " is enrolled in:");
        for (ICourse course : enrollmentManager.getEnrolledCourses(student2)) {
            System.out.println(course.getCourseName());
        }
    }
}
