package divyansh.pprec;

import java.util.Arrays;

public class backtrrec {
    public static void main(String[] args) {
//        System.out.println(backtrack(3,3));
        //backtrackpathprdiag("", 3, 3);
        boolean[][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}

        };
        //backtrackpathprob s("",board,0,0);
        //backtrackpathprobsincl("",board,0,0);
        int[][] path=new int[board.length][board[0].length];
        allpathprint("",board,0,0,path,1);


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
//with ostacle at (2,2)
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
    static void backtrackpathprobsincl(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c==maze[0].length-1) {
            System.out.print(p + " ");
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if (r<maze.length-1) {
            backtrackpathprobsincl(p + 'D', maze, r+1, c);
        }
        if (c<maze[0].length-1) {
            backtrackpathprobsincl(p + 'R', maze, r, c+1);
        }
        if ( r>0 ) {
            backtrackpathprobsincl(p + 'U', maze, r-1, c);
        }
        if (c>0) {
            backtrackpathprobsincl(p + 'L', maze, r, c-1);
        }
        //line where func ends
        //so before func gets removed , also remove the changes the func made
        maze[r][c]=true;
    }
    static void allpathprint(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {
        if (r == maze.length-1 && c==maze[0].length-1) {
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
                System.out.println(p);
                System.out.println();


            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=steps;
        if (r<maze.length-1) {
            allpathprint(p + 'D', maze, r+1, c,path,steps+1);
        }
        if (c<maze[0].length-1) {
            allpathprint(p + 'R', maze, r, c+1,path,steps+1);
        }
        if ( r>0 ) {
            allpathprint(p + 'U', maze, r-1, c,path,steps+1);
        }
        if (c>0) {
            allpathprint(p + 'L', maze, r, c-1,path,steps+1);
        }
        //line where func ends
        //so before func gets removed , also remove the changes the func made
        maze[r][c]=true;
    }
}