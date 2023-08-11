package home_work_two;

import java.sql.Array;
import java.util.Arrays;

public class SortArr {
    public static int[] sortArr(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }


        int tmpArr[] = new int[max - min + 1];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (tmpArr[arr[i] - min] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                tmpArr[arr[i] - min] = count;
            }
        }

        int returnArr[] = new int[arr.length];

        int count = 0;
        for (int i = 0; i < tmpArr.length; i++) {
            if (tmpArr[i] > 0){
                for (int j = 0; j < tmpArr[i]; j++) {
                    returnArr[count] = min + i;
                    count++;
                }
            }
        }
        return returnArr;
    }
}
