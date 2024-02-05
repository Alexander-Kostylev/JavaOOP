package Employee;

import java.time.LocalDate;

public class Nurse extends Employee {

    private double seniority;

    public Nurse(String firstName, String lastName, LocalDate birthDate, double experience, double seniority) {
        super(firstName, lastName, birthDate, experience);
        this.seniority = seniority;
    }

    public Nurse() {
        this.seniority = 0;
    }

}
