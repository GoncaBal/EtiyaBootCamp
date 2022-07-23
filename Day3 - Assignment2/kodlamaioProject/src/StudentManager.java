public class StudentManager extends UserManager{
    public void getStudentId(Student student) {
        System.out.println(student.getStudentId() + " student id getirildi.");
    }

    public void getCourseName(Student student) {
        System.out.println(student.getCourseName() + "  course getirildi.");
    }
}
