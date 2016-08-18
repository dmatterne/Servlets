package be.david.servlets;

/**
 * Created by stannisbaratheon on 18/08/16.
 */
public class Person {
    private String firstname;
    private String lastname;
    private String dob;
    private String country;
    private Gender gender;

    public Person(String firstname, String lastname, String dob, String country, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.country = country;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob='" + dob + '\'' +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
