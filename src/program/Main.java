package program;

import entity.Numbers;
import entity.SomeArray;

public class Main {
    public static void main(String[] args) {
        Numbers<int>[]arr = new Numbers<int>[]{1,23,5};
        SomeArray someArray = new SomeArray(arr);
        someArray.printArray();
        someArray.bubbleSort();
        someArray.printArray();

    }
    public static  Comparable aa (Comparable a){
        return a;
    }
}
