package Patients;

import clients.Illness;
import clients.Owner;

import java.time.LocalDate;

public class Guepard extends Animal implements Goable{
    Double speedRun;

    Guepard(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double speedRun){
        super(nickName, owner, birthDate, illness);
        this.speedRun = speedRun;
    }

    Guepard(){
        super();
        this.speedRun = 20.0;
    }


    public void toGo() {
        System.out.println("Я умею бегать быстрее всех.");
    }

    @Override
    public double getRunSpead() {
        return 110D;
    }

    @Override
    public void eat() {
        System.out.println("Гепард есть");
    }
}
