package divyansh.codes;


public class maths {
    public static void main(String[] args) {
        System.out.println(rev2(12344));
    }
    static int sum = 0;



//        int[] arr={2,3,2,5,5,1,1};
//        System.out.println(ans(arr));
//        int n=67980;
//        System.out.println(odd(n));
//
//    }
//    public static boolean odd(int n){
//        return (n & 1) == 1;




//        if(n==0){
//            return;
//   }
//       System.out.println(n);
//       fun(n-1);
//       System.out.println(n);
//
//    }
       static void revl(int n) {
           if (n == 0) {
               return;
           }
           int rem = n % 10;
           sum = sum * 10 + rem;
           revl(n / 10);
       }
       static int rev2(int n){
           int digit=(int)(Math.log10(n))+1;
           return helper(n,digit);
       }
       private static int helper(int n, int digits) {
           if (n % 10 == 0) {
               return n;
           }
           int rem=n%10;
           return rem=(int)Math.pow(10,digits-1)+helper(n/10,digits-1);

       }
       static int sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
       }





//   private static int ans(int []arr){
//        int uniq=0;
//       for (int n:arr) {
//           uniq^=n;
//       }
//       return uniq;
   }

