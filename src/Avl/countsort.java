package Avl;

import java.util.Arrays;
import java.util.HashMap;

public class countsort {
    public static void Main(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        int[] countarray = new int[max + 1];
        for (int num :
                array) {
            countarray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countarray[i] > 0) {
                array[index] = i;
                index++;
                countarray[i]--;
            }

        }
    }

    //by using hashmaps
    public static void counthash(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        HashMap<Integer, Integer> countmap = new HashMap<>();
        for (int num :
                array) {
            countmap.put(num, countmap.getOrDefault(num, 0) + 1);

        }
        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countmap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                array[index] = i;
                index++;

            }


        }


    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        counthash(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void main (String[]args){
//        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
//        Main(arr);
//        System.out.println(Arrays.toString(arr));
//    }


}
