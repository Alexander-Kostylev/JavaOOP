package Patients;

import clients.Illness;
import clients.Owner;

import java.time.LocalDate;

public class Fish extends Animal implements Swimmable {

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
        this.nickName = "Золотая рыбка";
        this.owner = new Owner("Хозяин рыбки");
        this.birthDate = LocalDate.of(2023, 1, 27);
        this.illness = new Illness("Болит плавник");
    }

    @Override
    public void toSwim() {
        System.out.println("Живу в воде, плаваю отлично!");
    }

    @Override
    public double getSwimSpeed() {
        return 10D;
    }

    public void eat() {
        System.out.println("Рыбка есть в воде");
    }
}
