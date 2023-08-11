package seminar_two;

import java.util.TreeMap;

public class SortArray {
    public static int[] sortArray (int[] oldArray){
        int[] newArray = new int[oldArray.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < oldArray.length; i++) {
            map.put(oldArray[i], map.getOrDefault(oldArray[i], 0) + 1);

/*
            альтернативный вариант
            if (map.containsKey(oldArray[i])){
                map.put(oldArray[i], map.get(oldArray[i]) + 1);
            }else {
                map.put(oldArray[i], 1);
            }
*/

        }
        int i = 0;
        for (Integer key : map.keySet()){
            for (int j = 0; j < map.get(key); j++) {
                newArray[i++] = key;
            }
        }

        return newArray;

    }
}
