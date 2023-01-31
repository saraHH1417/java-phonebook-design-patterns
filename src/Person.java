package src;

import java.util.Objects;

public class Person {

    private String name;
    private String passportId;

    public Person(String name, String passportId) {
        this.name = name;
        this.passportId = passportId;
    }

    public Person(String passportId) {
        this.passportId = passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(passportId, person.passportId);
    }

    @Override
    public int hashCode() {
        return passportId != null ? passportId.hashCode() : 0;
    }
}
