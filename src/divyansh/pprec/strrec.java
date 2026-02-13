package divyansh.pprec;

public class strrec {
    public static void main(String[] args) {
        System.out.println(strskipappnotapple("bdapplegf"));

    }
    //give p diff return
    //up is unprocessed string as real string and p is processed string as ans req.
    static void strskip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            strskip(p,up.substring(1));
        }else{
            strskip(p+ch,up.substring(1));

        }
    }
    //ret the string
    static String  strskipret(String up){
        if(up.isEmpty()){
            System.out.println(up);
            return " ";
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            return strskipret(up.substring(1));
        }else{
            return ch+strskipret(up.substring(1));

        }
    }
    //skip a string
    static String  strskipapple(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            return strskipapple(up.substring(5));
        }else{
            return up.charAt(0)+strskipapple(up.substring(1));

        }
    }//skip app not apple
    static String  strskipappnotapple(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch=up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")){
            return strskipappnotapple(up.substring(3));
        }else{
            return up.charAt(0)+strskipappnotapple(up.substring(1));

        }
    }
}
