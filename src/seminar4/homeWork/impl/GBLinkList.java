package seminar4.homeWork.impl;

import seminar4.list.core.GBList;

import java.util.Iterator;

public class GBLinkList<T> implements GBList<T> {

    private Node<T> head;
    // private Node<T> temp;
    private int size = 0;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node() {
            this.value = null;
            this.next = null;
        }

        Node(T elem, Node<T> nextNode) {
            this.value = elem;
            this.next = nextNode;
        }
    }


    public GBLinkList() {
        size = 0;
        head = new Node<>();
    }

    @Override
    public void add(T elem) {
        if (size == 0) {
            head.value = elem;
            size++;
        } else {
            Node<T> addNode = new Node<T>(elem, null);
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = addNode;
            size++;
        }
    }

    @Override
    public void remove(int index) {
        Node<T> previousNode = new Node<>();
        Node<T> temp = head;
        try {
            int tempIndex = 0;
            while (index > tempIndex) {


                tempIndex++;
            }


        } catch (IndexOutOfBoundsException e) {
            e.fillInStackTrace();
        }

    }

    @Override
    public T get(int index) {
        Node<T> temp = head;
        int tempIndex = 0;
        while (index > tempIndex) {
            temp = temp.next;
            tempIndex++;
        }
        return temp.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        {
            StringBuilder builder = new StringBuilder("[");
            Node<T> element = head;
            while (element != null) {
                builder.append(element.value).append(", ");
                element = element.next;
            }
            if (builder.length() == 1)
                return "[]";
            builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
            builder.append("]");
            return builder.toString();
        }
    }
}
