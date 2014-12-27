package lab.pkg1;

import java.util.Random;

// Lab 1 //
// Abdul Wahab //

public class MyNum {

    int randValue;

    public MyNum() {
        Random randomestValue = new Random();
        randValue = randomestValue.nextInt(199) + 1;

    }

    public int getMyNum() {

        return randValue;

    }

    public String toString() {

        return "" + randValue;

    }

}
