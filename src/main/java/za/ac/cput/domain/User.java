package za.ac.cput.domain;

/* User.java
     User POJO class
     Author: LJ Smal (223236012)
     Date: 11 May 2025 */

import java.time.LocalDate;

public class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected Address address;
    protected String cellphoneNumber;
    protected String gender;
    protected LocalDate dateOfBirth;

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddressId() {
        return address;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
