public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Course course;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, Course course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
