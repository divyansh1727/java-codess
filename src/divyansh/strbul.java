package divyansh;

import java.util.Arrays;

public class strbul {
    public static void main(String[] args) {
        String str=null;
        System.out.println(ispalindreme(str));
//        String name="divyansh";
//        System.out.println(Arrays.toString(name.toCharArray()));
        //[d, i, v, y, a, n, s, h]
        //palindrome
        //-reverse
        //-start adding ch
    }
    static boolean ispalindreme(String str){
        if(str ==null || str.length()==0){
            return true;
        }
        str=str.toLowerCase();
        for (int i = 0; i <=str.length() / 2 ; i++) {
            char s=str.charAt(i);
            char e=str.charAt(str.length()-1-i);
            if(s!=e){
                return false;
            }

        }
        return true;

    }

}
