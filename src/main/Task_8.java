package main;

import java.util.Arrays;
import java.util.Iterator;

public class Task_8 {
    private static void iteratorIt(String[] array){
        Iterator<String> it = Arrays.stream(array).iterator();
        while(it.hasNext()) { System.out.println(it.next());
        }
    }
    private static <T> void iteratorGeneric(T[] array) {
        Iterator<T> it = Arrays.stream(array).iterator();
        while (it.hasNext()) { System.out.println(it.next());
        }
    }
    public static void main(String[] args) {
        Task_8 main = new Task_8();
        String[] drzewa  = {"brzoza", "modrzew", "grab", "buk", "wierzba"};
        main.iteratorGeneric(drzewa);
        main.iteratorIt(drzewa);
    }
}
