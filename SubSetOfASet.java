/*Print all the subsets of a set of first n natural numbers */
import java.util.*;
public class SubSetOfASet {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=-0; i <subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void getSubsets(int n, ArrayList<Integer> subset){
        if(n ==0){
            printSubset(subset);
            return;
        }
        // add num
        subset.add(n);
        getSubsets(n-1, subset);
        // remove num
        subset.remove(subset.size()-1);
        getSubsets(n-1, subset);
    }
    public static void main(String args[]){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        getSubsets(n, subset);
    }
}
