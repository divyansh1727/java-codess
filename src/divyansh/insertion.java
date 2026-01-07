package divyansh;


import java.util.Arrays;

//sorting partially
public class insertion {
    public static void main(String[] args) {
        int[] arr={4,8,1,2,2};
        inst(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void inst(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }

        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
