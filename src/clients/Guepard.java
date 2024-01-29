package clients;

import java.time.LocalDate;

public class Guepard extends Animal{
    Double speedRun;

    Guepard(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double speedRun){
        super(nickName, owner, birthDate, illness);
        this.speedRun = speedRun;
    }

    Guepard(){
        super();
        this.speedRun = 20.0;
    }

    @Override
    public void toGo() {
        System.out.println("Я умею бегать быстрее всех.");
    }

    @Override
    public void fly() {
        System.out.println("Мне не надо летать, я быстро бегаю");
    }

    @Override
    public void swim() {
        System.out.println("Я могу переплыть не широкую реку");
    }
}
