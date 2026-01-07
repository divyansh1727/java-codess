package divyansh;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr={3,1,-5,94,2};
        selsort(arr);
        System.out.println(Arrays.toString(arr));

        }
    static void selsort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            //swap,max element
            int last=arr.length-i-1;
            int maxind=getmaxindex(arr,0,last);
            swap(arr,maxind,last);

        }
    }
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }

    private static int getmaxindex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }

        }
        return max;

    }
}
