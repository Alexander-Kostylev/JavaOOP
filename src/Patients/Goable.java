package Patients;

import java.util.ArrayList;
import java.util.List;


public interface Goable {

    // public static final List<Integer> pi = new ArrayList<Integer>(); тип после = уже не поменять на другой
    default void toGo() {
        System.out.println("Могу передвигаться по суше.");
    }

    ; // любой метод в интерфейсе публичный и абстрактный

    default double getRunSpead() {
        return 2D;
    }

}
