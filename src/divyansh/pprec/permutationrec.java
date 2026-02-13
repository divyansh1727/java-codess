package divyansh.pprec;

import java.util.ArrayList;

public class permutationrec {
    public static void main(String[] args) {
//        perm("","abc");
//        ArrayList<String> ans = permal("", "abc");
//        System.out.println(ans);
        System.out.println(permdcount("", "abc"));


    }

    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perm(f + ch + s, up.substring(1));

        }

    }//for arraylist

    static ArrayList<String> permal(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //local to this call
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permal(f + ch + s, up.substring(1)));

        }
        return ans;
    }
//no.of perm count
    static int permdcount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permdcount(f + ch + s, up.substring(1));

        }
        return count;
    }
}
