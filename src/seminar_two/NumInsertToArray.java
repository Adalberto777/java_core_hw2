package seminar_two;

public class NumInsertToArray {
    public static int[] numInsertToArray (int[] oldArray, int num, int index) {
        if(index < 0 || index > oldArray.length) {
            throw new IllegalArgumentException("Index out of range");
        }

        int returnArray[] = new int[oldArray.length + 1];

        System.arraycopy(oldArray, 0, returnArray, 0, index);

        returnArray[index] = num;

        System.arraycopy(oldArray, index, returnArray, index + 1, oldArray.length - index );

        return returnArray;
    }

    public static int[] numInsertToArray (int[] oldArray, int num) {
        return numInsertToArray(oldArray, num, oldArray.length);
    }
}
