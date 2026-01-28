package heltalsarray;

import java.util.Arrays;

public class HeltalsArray {
    int[] arr = new int[5];
    int index = 0;

    public void add(int x) {
        if (index <5 ) {
            arr[index] = x;
            index++;
        }
    }

    public String toString() {
        return "HeltalsArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public Integer getValue(int i) {
        try {
            return arr[i];
        } catch( ArrayIndexOutOfBoundsException e){
            return null;
        }
    }
}
