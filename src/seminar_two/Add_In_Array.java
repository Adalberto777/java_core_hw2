package seminar_two;

public class Add_In_Array {
    public static int[] add_in_array (int num, int[] oldArray){
        int newArray[] = new int[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        newArray[oldArray.length] = num;

        return newArray;
    }

    public static int[] add_in_array (int num, int index, int[] oldArray){

        if(index < 0 || index > oldArray.length){
            throw new IllegalArgumentException("Index out of range");
        }

        int returnArray[] = new int[oldArray.length + 1];
        int tmpIndex = 0;

        if(index < oldArray.length){

            for (int i = 0; i < oldArray.length; i++) {
                if(i == index){
                    tmpIndex = 1;
                    returnArray[i] = num;
                    returnArray[i + 1] = oldArray[i];

                } else{
                    returnArray[i + tmpIndex] = oldArray[i];
                }
            }
        }

        if(index == oldArray.length){
            returnArray = add_in_array(num, oldArray);
        }
        return returnArray;
    }
}
