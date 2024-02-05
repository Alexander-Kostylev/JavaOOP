package Patients;

import clients.Illness;
import clients.Owner;

import java.time.LocalDate;

public class Penguin extends Animal implements Goable, Swimmable{

    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Penguin(){
        super();
    }

    @Override
    public double getSwimSpeed() {
        return 35D;
    }

    public void toGo() {
        System.out.println("Хожу очень медленно");
    }

    @Override
    public void eat() {
        System.out.println("Пингвин есть");
    }
}
