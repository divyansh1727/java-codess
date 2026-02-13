package divyansh.pprec;
public class dice {
    public static void main(String[] args) {
        dicee("", 4);
    }
    static void dicee(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i <= target; i++) {
            dicee(p + i, target - i);
        }
    }
}

