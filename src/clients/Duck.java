package clients;

import java.time.LocalDate;

public class Duck extends Animal{

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
        System.out.println("Умею плавать, летать, ходить. Но хожу очень плохо.");
    }

    @Override
    public void fly() {
        System.out.println("Умею плавать, летать, ходить. Могу летель в клине.");
    }

    @Override
    public void swim() {
        System.out.println("Умею плавать, летать, ходить. Плаваю, но не так хорошо как рыба и ныряю.");
    }
}
