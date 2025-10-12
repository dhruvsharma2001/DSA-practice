package Recursion;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        boolean board[][]={
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        //System.out.println(UniquePaths(3, 3));
        //PrintUniquePaths("", 3, 3);
        //System.out.println(PrintUniquePathsWithDiagonal("", 3, 3));
        PathWithObstacle("", board, 0, 0);
    }
}
