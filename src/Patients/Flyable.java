package Patients;

public interface Flyable {

    default void toFly(){
        System.out.println("Могу летать.");
    };

    default double getFlySpeed(){
        System.out.println("Лечу со скоростью.");
        return 6D;
    };
}
