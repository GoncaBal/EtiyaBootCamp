package entities;

import java.util.Date;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private int birthOfDate;
    private String nationalityId;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, int birthOfDate, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.nationalityId = nationalityId;
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

    public int getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(int birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
