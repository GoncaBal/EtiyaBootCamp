public class Main {
    public static void main(String[] args) {
        Category category1 = new Category(1, "Yaz?l?m");
        Instructor instructor1 = new Instructor(1, "Engin", "Demiro?");
        Course course1 = new Course(1, "Java + React", category1, instructor1);
        Course course2 = new Course(2, "C# + Angular", category1, instructor1);
        Student student1 = new Student(1, "Gonca", "Bal", course1);

        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        courseManager.add(course2);

        for (Course course : courseManager.getAll()) {
            System.out.println(course.getId()+" "+course.getCourseName()+" "+course.getCategory().getName()
                    +" "+course.getInstructor().getFirstName()+" "+course.getInstructor().getLastName());
        }

        StudentManager studentManager=new StudentManager();
        studentManager.add(student1);

        for(Student student:studentManager.getAll()){
            System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getLastName()
                    +" "+student.getCourse().getCourseName());
        }
    }
}
