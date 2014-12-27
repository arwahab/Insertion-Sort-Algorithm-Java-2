package lab.pkg1;

// Lab 1 //
// Abdul Wahab //

public class Node {

    int i;
    long time;

    public Node() {

        i = new MyNum().getMyNum();
        time = new Time().getTime();

    }

    public Node(MyNum m, Time tx) {

        i = m.getMyNum();
        time = tx.getTime();
    }

    public int getMyNum() {

        return i;

    }

    public long getTime() {
        return time;
    }

    public String toString() {

        return "Number:" + i + "\tTime: " + time;
    }
}
