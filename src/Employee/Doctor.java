package Employee;

import java.time.LocalDate;

public class Doctor extends Employee {

    private int countOperations;

   public Doctor(String firstName, String lastName, LocalDate date, double experience, int countOperations){
        super(firstName, lastName, date, experience);
        this.countOperations = countOperations;
    }

    public Doctor(){
        super();
        this.countOperations = 0;
    }

}
