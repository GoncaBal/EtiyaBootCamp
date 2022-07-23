import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    List<Course> courses=new ArrayList<>();


    public void add(Course course){
        courses.add(course);
        System.out.println("Kurs eklendi:" +course.getCourseName());
    }
    public List<Course> getAll(){
        return courses;
    }
}
