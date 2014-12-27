package lab.pkg1;

// Lab 1 //
// Abdul Wahab //

public class Time {

    long time;

    public Time() {
        time = System.nanoTime();
    }

    public long getTime() {
        return time;
    }

    public String toString() {

        return "" + time;

    }

}
