package entity;

public class Numbers<T extends  Number> implements Comparable<T> {

    private T number;

    public Numbers(T number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "number=" + number +
                '}';
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    @Override
    public int compareTo(T anotherNumber) {
        if (this.number == anotherNumber) {
            return 0;
        } else if (this.number.doubleValue() < anotherNumber.doubleValue()) {
            return -1;
        } else {
            return 1;
        }
    }


}
