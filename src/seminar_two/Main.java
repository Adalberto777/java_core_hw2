package seminar_two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 4, 5, 6, 5, 5, 7, 8, 1, 1, 1, 2, 2, 3, 8, 1, 2, 9, 1, 8, 9, 5, 4, 3, 2};
        // самостоятельная работа
        int[] newArray = Add_In_Array.add_in_array(5,4, myArray);
        // пример решения преподавателя
        int[] newArray2 = NumInsertToArray.numInsertToArray(myArray, 5, 4);
        int[] newArray3 = SortArray.sortArray(myArray);

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray2));
        System.out.println(Arrays.toString(newArray3));
    }
}
