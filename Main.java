package lab.pkg1;

import java.util.*;

// Lab 1 //
// Abdul Wahab //

public class Main {

    public static Storage store;
    public static Node nonode;

    public static void main(String[] args) {

        store = new Storage(50);
        for (int i = 0; i < 50; i++) {
            nonode = new Node();
            store.addNode(i, nonode);
        }
        store.arrayInsertionSortNum();
        store.printTheArray();

        System.out.println("Highest Time of Node: " + store.maximumTime());
        System.out.println("Lowest Time of Node: " + store.minimumTime());

    }
}
