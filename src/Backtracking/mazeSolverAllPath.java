package Backtracking;

public class mazeSolverAllPath {
    public static void main(String[] args) {
//        allPaths("", 0, 0);
        boolean[][] maze = {{true, true, true},{true, true, true},{true, true, true}};
//        paths("",0,0,maze);
        backPaths("",0,0,maze);
    }

    // This will give stack overflow as recursion will keep on going
    static void allPaths(String p, int r, int c) {
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }
        if(c<2){
            allPaths(p+"R", r, c+1);
        }
        if(r<2){
            allPaths(p+"D", c, r+1);
        }
        if(r>0){
            allPaths(p+"U", r-1, c);
        }
        if(c>0){
            allPaths(p+"L", r, c-1);
        }
    }

    static void paths(String p, int r, int c, boolean[][] maze) {
        if(!maze[r][c]) return;

        maze[r][c] = false;

        if(r==2 && c==2){
            System.out.println(p);
            return;
        }

        if(c<2){
            paths(p+"R", r, c+1, maze);
        }
        if(r<2){
            paths(p+"D", r+1, c, maze);
        }
        if(r>0){
            paths(p+"U", r-1, c, maze);
        }
        if(c>0){
            paths(p+"L", r, c-1, maze);
        }
    }

    static void backPaths(String p, int r, int c, boolean[][] maze) {

        if(r==2 && c==2){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) return;

        maze[r][c] = false;

        if(c<2){
            backPaths(p+"R", r, c+1, maze);
        }
        if(r<2){
            backPaths(p+"D", r+1, c, maze);
        }
        if(r>0){
            backPaths(p+"U", r-1, c, maze);
        }
        if(c>0){
            backPaths(p+"L", r, c-1, maze);
        }

        // Resetting the maze during call back
        maze[r][c]=true;

    }
}
