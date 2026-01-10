package divyansh;

public class patterns {
    public static void main(String[] args) {
        pat1(4);
    }

        //pat3
//        for (int row = 1; row <=n; row++) {
//            for (int cols = 1; cols <=row; cols++) {
//                System.out.print(cols+" ");
//            }
        //pat5
        static void pat1(int n) {
//            for (int i = 0; i <2 * n; i++) {
//                int totclinerow= i>n ?2 * n-i-1:i;
//                for (int j = 0; j <totclinerow; j++) {
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//
//            }
            //queno. 28
//            for (int i = 0; i <2 * n; i++) {
//                int totclinerow= i>n ?2 * n-i-1:i;
//                int noofspaces=n-totclinerow;
//                for (int s = 0; s <noofspaces ; s++) {
//                    System.out.print(" ");
//
//                }
//                for (int j = 0; j <totclinerow; j++) {
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//
//            }
            //ques.30
            for (int row = 1; row <=2*n; row++) {
                //c->no.totalcol
                int c=row>n ? 2*n-row:row;
                for (int spaces = 0; spaces <n-c ; spaces++) {
                    System.out.print("  ");

                }
                //before and for 1
                for (int cols = c; cols >=1; cols--) {
                    System.out.print(cols+" ");
                }
                //for right after 1 vslues
                for (int j = 2; j<=c; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();

            }
        }

        }


