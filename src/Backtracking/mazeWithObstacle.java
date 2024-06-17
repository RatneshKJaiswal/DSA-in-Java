package Backtracking;

public class mazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},{true, false, true},{true, true, true}};

        paths("",maze , 0, 0);
    }

    // Assuming obstacle value false in maze array
    static void paths(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r== maze.length-1 && c<maze[0].length-1){
            paths(p+"R",maze,r,c+1);
        }
        else if(r<maze.length-1 && c== maze[0].length-1){
            paths(p+"D",maze,r+1,c);
        }
        else{
            paths(p+"R",maze,r,c+1);
            paths(p+"D",maze,r+1,c);
        }
    }
}
