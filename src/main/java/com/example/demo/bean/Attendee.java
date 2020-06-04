package com.example.demo.bean;

public class Attendee {
    private String email;

    public Attendee(){}
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "email='" + email + '\'' +
                '}';
    }

}
