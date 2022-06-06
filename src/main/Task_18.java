package main;

import java.util.ArrayList;
import java.util.List;

public class Task_18 {
    private static String getElement(List list, Integer number) {
        return (list).get(number).toString();
    }
    public static void main(String[] args) {
        Integer i = 10;
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.print(getElement(list, 1));
    }
}
