public class Student extends User{
    private String studentId;
    private String courseName;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String studentId, String courseName) {
        super(id, firstName, lastName);
        this.studentId = studentId;
        this.courseName = courseName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
