package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String _name, String _email, char _gender) {
        name = _name;
        email = _email;
        gender = _gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return ("Author, E-mail and gender: " + name + ' ' + email + ' ' + gender);
    }
}
