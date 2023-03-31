package at.fhtw.slm.customerserviceapp.model;

import java.time.LocalDate;

public class Customer {

    private String firstName;
   private String LastName;

    private LocalDate dayOfBirth;

    public Customer(String firstName, String lastName, LocalDate dayOfBirth) {
        this.firstName = firstName;
        LastName = lastName;
        this.dayOfBirth = dayOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
