package divyansh.pprec;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
//        System.out.println(subseqarr("","abc"));
        System.out.println(subseqascret("","abc"));


    }
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));

    }

    static ArrayList<String> subseqarr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqarr(p+ch,up.substring(1));
        ArrayList<String> right=subseqarr(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    //ascii value subsq
    static void subseqasc(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseqasc(p + ch, up.substring(1));
        subseqasc(p+(ch+0), up.substring(1));

    }
    //ret string of asc
    static ArrayList<String> subseqascret(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> l=subseqascret(p + ch, up.substring(1));
        ArrayList<String> r=subseqascret(p+(ch+0), up.substring(1));
        ArrayList<String> t=subseqascret(p+(ch+0),up.substring(1));
        l.addAll(r);
        l.addAll(t);
        return l;

    }
}
