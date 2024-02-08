package seminar4.list;

import seminar4.list.core.GBList;
import seminar4.list.core.impl.GBArayList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArayList<>();

        list.add(3);
        list.add(5);
        list.add(7);

        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println("============================");
        System.out.println(list);
        System.out.println(list.size());
    }

}
