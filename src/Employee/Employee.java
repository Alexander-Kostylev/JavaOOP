package Employee;

import java.time.LocalDate;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private double experience;

     Employee(String firstName, String lastName, LocalDate birthDate, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.experience = experience;
    }

     Employee(){
        this.firstName = "Иван";
        this.lastName = "Иванов";
        this.birthDate = LocalDate.of(2000, 01, 01);
        this.experience = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getExperience() {
        return experience;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
