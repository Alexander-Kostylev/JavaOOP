package seminar4.homeWork;

import seminar4.homeWork.impl.GBLinkList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainGBLinkList {
    public static void main(String[] args) {

        GBLinkList<Integer> lList = new GBLinkList<Integer>();

        lList.add(2);
        lList.add(4);
        lList.add(7);
        lList.add(12);

        System.out.println(lList);
        System.out.println(lList.size());

        System.out.println("============================================================================");

        List<Integer> list = new LinkedList<Integer>();
        System.out.println();
    }
}
