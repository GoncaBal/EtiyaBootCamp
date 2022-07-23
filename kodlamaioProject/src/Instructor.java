public class Instructor extends User{
    private String email;

    public Instructor(int id, String firstName, String lastName, String email) {
        super(id, firstName, lastName);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
