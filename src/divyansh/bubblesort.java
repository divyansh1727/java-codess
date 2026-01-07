package divyansh;

import java.util.Arrays;

//comparing elements , keeping them in ascending order
public class bubblesort {
    public static void main(String[] args) {
        int[]arr={3,2,7,6,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //rn the steps n-1 times
        for (int i = 0; i <arr.length; i++) {
            swapped=false;
            //foreachstep max item cmes in last index
            for (int j = 1; j <arr.length-i ; j++) {
                //swap if the element is smaller than prev
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
               swapped=true;

            }
            if(!swapped){break;

            }

        }
    }


}
