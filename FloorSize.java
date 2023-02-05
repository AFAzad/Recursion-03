// Q. Place Tiles of size 1xm in a floor size of nxm 
public class FloorSize {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m ){
            return 1;
        }
        // vertical place
        int verticalPlace = placeTiles(n-m, m);

        // horizontally place
        int horizontalPlace = placeTiles(n-1, m);
        return verticalPlace+horizontalPlace;
    }
    public static void main(String[] args){
        int n = 4, m = 2;
        System.out.println("Total number of place tiles: "+placeTiles(n, m));

    }
    
}
