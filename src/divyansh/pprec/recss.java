package divyansh.pprec;

import java.util.Arrays;

public class recss {
    public static void main(String[] args) {
        int[] arr={4,3,2,8,1};
        ss(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void tiangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            tiangle(r, c + 1);
        } else {
            System.out.println();
            tiangle(r - 1, 0);
        }

    }
    static void ss(int[] arr,int r, int c, int max){
        if (r == 0) {
            return;

        }
        if(c<r) {
            if (arr[c] > arr[max]) {
                ss(arr, r, c + 1, c);
            }
            else{
                ss(arr,r,c+1,max);
            }
        }
        else {
                int temp = arr[max];
                arr[max] = arr[r - 1];
                arr[r - 1] = temp;
            }

        ss(arr, r-1, 0, 0);
    }
}
