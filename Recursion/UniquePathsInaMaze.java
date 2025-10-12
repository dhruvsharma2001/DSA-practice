package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class UniquePathsInaMaze {
    public static int UniquePaths(int row, int column){
        if(row == 1 || column == 1){
            return 1;
        }
        int left = UniquePaths(row-1, column);
        int right = UniquePaths(row, column-1);
        return left + right;
    }

    public static void PrintUniquePaths(String p, int r, int c){
        if(r == 1 && c ==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            PrintUniquePaths(p + 'D', r-1, c);
        }
        if(c>1){
            PrintUniquePaths(p + 'R', r, c-1);
        }
    }
    public static ArrayList<String> PrintUniquePathsWithDiagonal(String p, int r, int c){
        if (r == 1 && c == 1) {
            ArrayList<String> result = new ArrayList<>();
            result.add(p);
            return result; 
        }
        ArrayList<String> result = new ArrayList<>();
        if(r>1 && c>1){
            result.addAll(PrintUniquePathsWithDiagonal(p + 'D', r - 1, c-1));
        }
        if (r > 1) {
            result.addAll(PrintUniquePathsWithDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            result.addAll(PrintUniquePathsWithDiagonal(p + 'H', r, c - 1));
        }
        return result;
    }

    public static void PathWithObstacle(String p, boolean maze[][], int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) return;

        if(r<maze.length-1){
            PathWithObstacle(p + 'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            PathWithObstacle(p + 'R', maze, r, c+1);
        }
    }

    public static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) return;

        maze[r][c] = false; //initialization of recursion calls
        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }
        if(r>0){
            allPaths(p + 'U', maze, r-1, c);
        }
        if(c>0){
            allPaths(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true; // calls come out of stack -->Backtracking

    }

    public static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c])
            return;

        maze[r][c] = false; // initialization of recursion calls
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true; // calls come out of stack -->Backtracking
        path[r][c] = 0;
         
    }
    public static void main(String[] args) {
        boolean board[][]={
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        int[][] path = new int[board.length][board[0].length];
        //System.out.println(UniquePaths(3, 3));
        //PrintUniquePaths("", 3, 3);
        //System.out.println(PrintUniquePathsWithDiagonal("", 3, 3));
        //PathWithObstacle("", board, 0, 0);
        //allPaths("", board, 0, 0);
        allPathPrint("", board, 0, 0, path, 1);
    }
}
