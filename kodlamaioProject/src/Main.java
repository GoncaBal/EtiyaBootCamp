public class Main {
    public static void main(String[] args) {

        UserManager userManager = new StudentManager();


        User student1 = new Student(1, "Ahmet", "Kalem", "4545", "JAVA");
        Instructor instructor1 = new Instructor(1, "Mehmet", "Tek", "mehmettek@gmail.com");


        userManager.login(new Student(2, "Yucel", "Hep", "45645", "JAVA"));
        userManager.login(student1);
        userManager.add(student1);
        userManager.update(student1);
        userManager.delete(student1);
    }
}
