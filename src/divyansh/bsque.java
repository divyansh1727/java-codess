package divyansh;

import java.util.Arrays;

//sorted array
public class bsque {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,1},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,6)));

    }
    static int[] binarysearch(int[][] matrix,int rows,int cstart, int cend ,int target) {
    while(cstart<=cend){
        int mid=cstart+(cend-cstart)/2;
        if(matrix[rows][mid]==target){
            return new int[]{rows,mid};

        }
        if(matrix[rows][mid]<target){
            cstart=mid+1;

        }
        if(matrix[rows][mid]>target){
            cend=mid-1;
        }
    }
    return new int[]{-1,1};
    }
    static int[] search(int[][] matrix, int target){
        int rows= matrix.length;
        int cols=matrix[0].length;//be care4ful, matrix maybe em0pty
        if(rows==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        while(rstart<rend-1){
            int mid=rstart+(rend-rstart)/2;
            if (matrix[mid][cmid]==target){
                return new int[]{mid,cmid};

            }
            if(matrix[mid][cmid]<target){
                rstart=mid;
            }else{
                rend=mid;
            }
        }
        //run loop till 2 row remains
        //check whether the target is avail in 2 rows
        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }

        //return for the 1st half
        if(target<= matrix[rstart][cmid-1]){
            return binarysearch(matrix,rstart,0,cmid-1,target);

        }
        if(target>= matrix[rstart][cmid+1]&& target<=matrix[rstart][cols-1]){
            return binarysearch(matrix,rstart,0,cols+1,target);

        }
        if(target<= matrix[rstart+1][cmid-1]){
            return binarysearch(matrix,rstart+1,0,cmid-1,target);

        }
        else {
       // if(target>= matrix[rstart+1][cmid-1]){
            return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);

        }

    }
}
