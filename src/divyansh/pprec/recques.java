package divyansh.pprec;

public class recques {
    public static void main(String[] args) {
        //letterrec("","12");
        System.out.println(letterreccount("", "12"));

    }
    static void letterrec(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            letterrec(p + ch, up.substring(1));

        }
    }
        static int letterreccount(String p, String up){
            if (up.isEmpty()) {
                return 1;
            }
            int count = 0;
            int digit = up.charAt(0) - '0';
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                count = count + letterreccount(p + ch, up.substring(1));

            }
            return count;


        }
        }


