package quesrec;

import java.util.Arrays;

public class sumtri {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        triangle(A);

    }
    public static void triangle(int[] A ){
        if(A.length<1){
            return;
        }
        int[] t=new int[A.length-1];
        for (int i = 0; i < A.length-1; i++) {
            int x=A[i]+A[i+1];
            t[i]=x;

        }triangle(t);
        System.out.println(Arrays.toString(A));

    }
}
