package Backtracking;

public class mazeSolver {
    public static void main(String[] args) {
        int res = count(3,3);
        System.out.println(res);
        paths("", 3, 3);
        System.out.println(" ");
        pathsD("", 3, 3);
    }
    static int count(int r, int c){
        if(r == 1 || c == 1) return 1;
        int left =  count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    // Only right and down to follow
    static void paths(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r == 1 && c > 1){
            paths(p+'R', r, c-1);
        }
        else if(r > 1 && c == 1){
            paths(p+'D', r-1, c);
        }
        else{
            paths(p+'D', r-1, c);
            paths(p+'R', r, c-1);
        }
    }

    static void pathsD(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r == 1 && c > 1){
            pathsD(p+'R', r, c-1);
        }
        else if(r > 1 && c == 1){
            pathsD(p+'D', r-1, c);
        }
        else{
            pathsD(p+'D', r-1, c);
            pathsD(p+'R', r, c-1);
            pathsD(p+'C', r-1, c-1);
        }
    }
}
