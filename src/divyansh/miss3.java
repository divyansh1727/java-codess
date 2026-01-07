package divyansh;

import java.util.ArrayList;
import java.util.List;

//check-> swap-> move.
public class miss3 {
    //finding duplicates

//public class solmissmulti {
//public class cyclicsort {

//    public static void main(String[] args) {
//        int[] arr={ };
//        System.out.println(sort(arr));
//    }
//    static int sort(int[] arr){
//        int i=0;
//        while(i<arr.length){
//            int correct=arr[i];
//            if(arr[i] < arr.length && arr[i]!=arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//        //search for element
//        for (int index =0; index < arr.length; index++) {
//            if(arr[index]!=index){
//                return index;
//            }
//
//        }
//     return arr.length;
//    }
//    static void swap(int[] arr, int f, int s) {
//        int temp=arr[f];
//        arr[f]=arr[s];
//        arr[s]=temp;
//    }
//}
//for missing no. in large arr list
//    public int findisappearedno(int[] nums) {
//            int i = 0;
//            while (i < nums.length) {
//                if (nums[i] != i + 1) {
//
//
//                    int correct = nums[i] - 1;
//                    if (nums[i] != nums[correct]) {
//                        swap(nums, i, correct);
//                    } else {
//                        return nums[i];
//                    }
//                }else{
//                    i++;
//                }
//            }
//            //search for elemen
//        return -1;
//    }

    //3
    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index] !=index+1){
                return index+1;
            }

        }
        return arr.length+1;
    }
        static void swap ( int[] arr, int f, int s){
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
        }
    }





