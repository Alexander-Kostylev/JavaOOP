package clients;

import java.time.LocalDate;

public class Fish extends Animal implements Goable{

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
    public void toGo() {
        System.out.println("Ходить не умею, не эволюционировала");
    }

    @Override
    public void fly() {
        System.out.println("Летать мне не зачем");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю как рыба в воде)");
    }

    public void eat() {
        System.out.println("Рыбка есть в воде");
    }
}
