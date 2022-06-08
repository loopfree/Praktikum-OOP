import java.util.*;

class Utility {
    public static <T> void swap(T[] array, int i, int j) {
		if(i < 0) return;
		if(i >= array.length) return;
		if(j < 0) return;
		if(j >= array.length) return;
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> T[] repeat(T[] ori, int n) {
        T[] newArr = (T[]) Arrays.copyOf(ori, ori.length * n, ori.getClass());;

        int newArrIdx = 0;
        
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < ori.length; ++j) {
                newArr[newArrIdx] = ori[j];        
                newArrIdx += 1;
            }
        }
        return newArr;
    }

    public static <T> String join(T[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length-1; ++i) {
            if(arr[i] == null) {
                sb.append("null");
            } else {
                sb.append(arr[i].toString());    
            }
            sb.append(',');
        }
        sb.append(arr[arr.length-1].toString());
        return sb.toString();
    }

    public static <T extends Number> double sum(T[] arr) {
        double result = 0;
        for(int i = 0; i < arr.length; ++i) {
            result = result + arr[i].doubleValue();
        }
        return result;
    }
}