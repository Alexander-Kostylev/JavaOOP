package clients;

import java.time.LocalDate;

public class Penguin extends Animal{

    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Penguin(){
        super();
    }

    @Override
    public void fly() {
        System.out.println("Не умею летать, хоть я и птица!");
    }

    @Override
    public void swim() {
        System.out.println("Хорошо плаваю");
    }

    @Override
    public void toGo() {
        System.out.println("Хожу очень медленно");
    }
}
