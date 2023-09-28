package Counter;

import java.util.OptionalInt;

public class Counter {
    private int counter;
    private int initialValue;

    public Counter() {
        this.counter = 0;
        this.initialValue = 0;
    }
    public Counter(int number) {
        this.counter = number;
        this.initialValue = number;
    }

    public void add(int adding) {
        counter = this.counter + adding;
    }

    public void add() {
        counter++;
    }

    public int reset() {
        this.counter = initialValue;
        return initialValue;
    }

    public int get() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
