package home_work_two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {-1, 2, 3, 4, 4, -5, 6, 5, 5, 7, 8, 1, 1, 1, 2, 2, 3, 8, 1, 2, 9, 1, 8, 9, 5, 4, 3, 2};
        // отсортированный массив
        int[] sortArray = SortArr.sortArr(myArray);

        System.out.println(Arrays.toString(SortArr.sortArr(sortArray)));
        // шифрование/расшифрование
        System.out.println(CodeOfCaesar.codeOfCaesar("Hello World!", 6, true));
        System.out.println(CodeOfCaesar.codeOfCaesar("Nkrru&]uxrj'", 6, false));
        // смещение массива
        int offsetArray[] = Shifter.offset(myArray, 3);
        System.out.println(Arrays.toString((myArray)));
    }
}
