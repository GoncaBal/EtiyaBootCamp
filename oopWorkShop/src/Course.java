public class Course {
private int id;
private String courseName;
private Category category;
private Instructor instructor;

    public Course() {
    }

    public Course(int id, String courseName, Category category, Instructor instructor) {
        this.id = id;
        this.courseName = courseName;
        this.category = category;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
