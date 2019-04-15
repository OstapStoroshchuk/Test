package entity;

import java.util.Arrays;

public class SomeArray<T extends Numbers> {

    private T array[];

    public SomeArray(T[] array) {
        this.array = (T[]) new Object[array.length];
        this.array = array;
    }

    public T[] mergeSort(T[] i) {
        if (array.length <= 1) {
            return array;
        }
        T[] left = (T[]) new Object[array.length / 2];
        T[] right = (T[]) new Object[array.length - left.length];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        // merge(left, right, array);
        return array;
    }

    //    private T[] merge(T[] left,T[] right,T[] result){
////        int indexOfLeft = 0;
////        int indexOfRight = 0;
////        int indexOfMergedList = 0;
////
////        while(indexOfLeft < left.length && indexOfRight < right.length) {
////            if(list1[indexOfList1].compareTo(list2[indexOfList2]) < 0) {
////                resultList[indexOfMergedList] = list1[indexOfList1];
////                indexOfList1++;
////            }else {
////                resultList[indexOfMergedList] = list2[indexOfList2];
////                indexOfList2++;
////            }
////            indexOfMergedList++;
////        }
////        System.arraycopy(list1, indexOfList1, resultList, indexOfMergedList, list1.length - indexOfList1);
////        System.arraycopy(list2, indexOfList2, resultList, indexOfMergedList, list2.length - indexOfList2);
////    }
    public T[] bubbleSort() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].getNumber().doubleValue() > (array[j + 1]).getNumber().doubleValue()) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public void printArray() {
//        for (Integer element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
        Arrays.stream(array).forEach(element -> {
            System.out.print(element + " ");
        });
        System.out.println();
    }
}
