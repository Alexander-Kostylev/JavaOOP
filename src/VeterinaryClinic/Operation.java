package VeterinaryClinic;

import Employee.Doctor;
import Employee.Nurse;
import Patients.Animal;

import java.time.LocalDate;

public class Operation {

    private LocalDate timeOperation;
    private Doctor doctor;

    Animal animal;


    public Operation(Doctor doctor, LocalDate timeOperation, Animal animal) {
        this.timeOperation = timeOperation;
        this.doctor = doctor;
        this.animal = animal;

    }


    public void getOperation(){
        System.out.println(doctor.getFirstName() + " делает операцию " + animal.getNickName() + ", в "
                + timeOperation);
    }
}
