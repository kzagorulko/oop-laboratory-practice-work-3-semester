package ru.zagorulko.practical.second;

/**
 * Created by liveuser on 12.09.18.
 */
public class Author {
    private String firstname, lastname;
    private char gender;
    private int birthyear;

    public Author(String firstname, String lastname, char gender, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthyear = birthyear;
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public char getGender() {
        return this.gender;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + firstname + '\'' +
                ", email='" + lastname + '\'' +
                ", gender=" + gender + '\'' +
                ", birthyear=" + birthyear +
                '}';
    }
}
