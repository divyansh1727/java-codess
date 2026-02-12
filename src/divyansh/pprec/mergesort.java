package divyansh.pprec;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        inplacemerge(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] iiplace(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int m= arr.length/2;
        int[] left= iiplace(Arrays.copyOfRange(arr,0,m));
        int[] right= iiplace(Arrays.copyOfRange(arr,m,arr.length));
        return mergeit(left,right);

    }

    private static int[] mergeit(int[] first, int[] second) {
        int[] mix=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length&& j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    static void inplacemerge(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int m= (s+e)/2;
         inplacemerge(arr,s,m);
         inplacemerge(arr,m,e);
         mergeinplace( arr,s,m,e);

    }

    private static void mergeinplace(int[] arr,int s, int m,int e) {
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i< m && j< e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i< m){
            arr[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            arr[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length ; l++) {
            arr[s+l]=mix[l];

        }
    }
}
