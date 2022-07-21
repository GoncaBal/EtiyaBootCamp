import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students=new ArrayList<>();
    public void add(Student student){
        students.add(student);
        System.out.println("Öğrenci kaydedildi: "+student.getFirstName());

    }
    public List<Student> getAll(){
        return students;
    }
}
