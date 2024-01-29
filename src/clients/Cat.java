package clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {

    //Todo напомнить в чём разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //Todo сначала конструктор Супер-класса
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    @Override
    public void eat() {
        System.out.println("Есть много и очень громко ночью");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //Todo статикой пользоваться аккуратно ( пароли там не хранить :-) )
    public static void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }

    @Override
    public void fly() {
        System.out.println("Мяяу! Я не могу летать и не хочу.");
    }

    @Override
    public void swim() {
        System.out.println("Плавать не люблю, но умею.");
    }

    @Override
    public void toGo() {
        System.out.println("Лучше полежать, чем ходить");
    }

    @Override
    public double getRunSpead() {
        return Goable.super.getRunSpead();
    }
}

