package com.dipak.spring.model;

public class UserDetailsRequestModel {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "firstname [" + getFirstname() + "]\nlastname [" + getLastname() + "]\nemail [" + getEmail()
                + "]\npassword [" + getPassword() + "]";

    }
}
