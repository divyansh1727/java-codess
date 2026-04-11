package Avl;
//rolling hash function
public class karp {
    private static final int Primeno=101;

    public static void main(String[] args) {
        karp algo = new karp();
        algo.search("approvakunal","div");
    }
    //can take any pno.
    private long calculatehash(String str){
        long hash=0;
        for (int i = 0; i <str.length() ; i++) {
            hash = (long) (hash + str.charAt(i) * Math.pow(Primeno, i));
        }
        return hash;
        }
        private long updatehash(long prevhash,char oldchar, char newchar,int patternlength){
        long newhash=(prevhash-oldchar)/Primeno;
        newhash= (long) (newhash+newchar*Math.pow(Primeno,patternlength-1));
        return newhash;
        }
        public void search(String text, String pattern){
        int patternlength=pattern.length();
        long patternhash=calculatehash(pattern);
        long texthash=calculatehash(text.substring(0,patternlength));
            for (int i = 0; i <=text.length()-patternlength; i++) {
                if(texthash==patternhash){
                    if(text.substring(i,i+patternlength).equals(pattern)){
                        System.out.println("pattern found at index"+i);
                    }
                }
                if(i<text.length()-patternlength){
                    texthash=updatehash(texthash,text.charAt(i),text.charAt(i+patternlength),patternlength);
                }

            }
        }

}
