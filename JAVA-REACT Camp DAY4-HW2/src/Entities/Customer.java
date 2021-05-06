package Entities;

import Abstract.Entity;

import java.util.Date;

public class Customer implements Entity {

    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String TCKN;

    public Customer() {}

    public Customer(int id, String firstName, String lastName, Date birthDate, String TCKN) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.TCKN = TCKN;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTCKN() {
        return TCKN;
    }

    public void setTCKN(String TCKN) {
        this.TCKN = TCKN;
    }
}
