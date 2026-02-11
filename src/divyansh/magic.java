package divyansh;

public class magic {
//    public class uniquemths {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n >> 1;
            ans+=last*base;
            base=base*5;
        }
        System.out.println(ans);

        //        int[] arr={2,3,3,4,2,6,6,-1,4};
//        System.out.println(ans(arr));
//    }
//    private static int ans(int[] arr){
//        int unique=0;
//        for (int n:arr) {
//            unique^=n;
//
//        }return unique;

   }
}
