package Patients;

public interface Swimmable {

    default void toSwim(){
        System.out.println("Умею плавать.");
    };

    default double getSwimSpeed(){
        System.out.println("Плаваю очень медленно, со скоростью.");
        return 1D;
    };
}
