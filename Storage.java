package lab.pkg1;

// Lab 1 //
// Abdul Wahab //
public class Storage {

    Node[] theArray;

    public Storage(int a) {
        theArray = new Node[a];

    }

    void addNode(int indexNum, Node a) {
        theArray[indexNum] = a;
    }

    void arrayInsertionSortNum() {

        for (int i = 1; i < theArray.length; i++) {
            int d = i;

            Node tempNum = theArray[i];

            while (d > 0 && theArray[d - 1].getMyNum() > tempNum.getMyNum()) {
                theArray[d] = theArray[d - 1];
                d--;
            }

            theArray[d] = tempNum;

        }
    }

    void arrayInsertionSortTime() {
        for (int i = 1; i < theArray.length; i++) {
            Node tempNum = theArray[i];
            int d = i;

            while (d < 0 && theArray[d - 1].getTime() > tempNum.getTime()) {
                theArray[d] = theArray[d - 1];
                d--;
            }

            theArray[d] = tempNum;

        }

    }

    public long maximumTime() {
        this.arrayInsertionSortTime();
        return theArray[theArray.length - 1].getTime();
    }

    public long minimumTime() {
        this.arrayInsertionSortTime();
        return theArray[0].getTime();
    }

    void printTheArray() {
        for (int i = 0; i < theArray.length; i++) {
            System.out.println(theArray[i] + "\t" + "Index #:" + "\t" + i);
        }
    }

}

//System.out.println("Index #:" + "\t"  +i+ "\t" + theArray[i]);

