package divyansh.pprec;

public class backtrrec {
    public static void main(String[] args) {
//        System.out.println(backtrack(3,3));
        //backtrackpathprdiag("", 3, 3);
        boolean[][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}

        };
        backtrackpathprobs("",board,0,0);

    }
    //count path

    static int backtrack(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = backtrack(r - 1, c);
        int right = backtrack(r, c - 1);
        return left + right;
    }

    //printing path
    static void backtrackpathpr(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }
        if (r > 1) {
            backtrackpathpr(p + 'D', r - 1, c);
        }
        if (c > 1) {
            backtrackpathpr(p + 'R', r, c - 1);
        }

    }//incl. diagonal

    static void backtrackpathprdiag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }
        if (r > 1 && c > 1) {
            backtrackpathprdiag(p + 'D', r - 1, c - 1);
        }
        if (r > 1) {
            backtrackpathprdiag(p + 'V', r - 1, c);
        }
        if (c > 1) {
            backtrackpathprdiag(p + 'H', r, c - 1);
        }

    }
//with bostacle at (2,2)
    static void backtrackpathprobs(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c==maze[0].length-1) {
            System.out.print(p + " ");
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if (r<maze.length-1) {
            backtrackpathprobs(p + 'D', maze, r+1, c);
        }
        if (c<maze[0].length-1) {
            backtrackpathprobs(p + 'R', maze, r, c+1);
        }
    }
}