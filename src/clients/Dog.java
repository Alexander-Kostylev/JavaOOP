package clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {

    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака есть!");
    }

    @Override
    public void fly() {
        System.out.println("Гаф! Я не могу летать.");
    }

    @Override
    public void swim() {
        System.out.println("Я могу плыть только по собачь. ");
    }

    @Override
    public void toGo() {
        System.out.println("Я могу ходить а еще люблю бегать и приносить палочки.");
    }
}
