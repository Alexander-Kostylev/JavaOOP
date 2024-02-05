package Patients;

import clients.Illness;
import clients.Owner;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Flyable, Swimmable {

    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck() {
        this.nickName = "Кряк";
        this.birthDate = LocalDate.of(2034, 11, 22 );
        this.illness = new Illness("Болезнь утки");
        this.owner = new Owner("Хозяин утки");
    }

    @Override
    public void toGo() {
        System.out.println("Хожу периваливаясь.");
    }


    @Override
    public void eat() {
        System.out.println("Утка есть!");
    }

    @Override
    public double getFlySpeed() {
        return 40D;
    }

    @Override
    public double getSwimSpeed() {
        return 5D;
    }
}
