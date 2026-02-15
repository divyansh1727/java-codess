package divyansh.codes;

import java.util.ArrayList;
import java.util.Arrays;

public class rec {
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5,4,4,4};
        ArrayList<Integer> ans=find(arr,4,0);
        System.out.println(ans);


    }

    static ArrayList<Integer> find(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length) {
            return list;

        }
        if ( arr[index] == target) {
            list.add(index);

        }
        ArrayList<Integer>ansfind=find(arr, target, index+1);
        list.addAll(ansfind);
        return list;

    }
}

