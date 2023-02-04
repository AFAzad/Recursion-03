public class Path_Count {
    // Q. Count total path in a maze to move from (0,0) to (n, m).
    public static int totalPath (int i, int j, int n, int m){
        if(i ==n || j == m){
            return 0;
        }
        if(i == n-1 && j == n-1 ){
            return 1;
        }
        // move downward
        int downMove = totalPath(i+1, j, n, m);
        // move right 
        int rightMove = totalPath(i, j+1, n, m);

        return downMove+rightMove;

    }
    public static void main(String[] args){
        int n = 3, m = 3;
        int ans = totalPath(0, 0, n, m);
        System.out.println("Total paths are: "+ ans);
    }
}
