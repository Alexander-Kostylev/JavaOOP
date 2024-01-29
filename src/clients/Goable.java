package clients;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {

    // public static final List<Integer> pi = new ArrayList<Integer>(); тип после = уже не поменять на другой
    void toGo(); // любой метод не реализованный публичный и абстрактный

    default double getRunSpead(){
        return 10D;
    }

}
