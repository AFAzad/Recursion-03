public class Permutation {
    // Time complexity : O(n)
    public static void printPermutation(String str, String permutation){
        if(str.length() ==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char  newChar = str.charAt(i);
            String  newStr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newStr, permutation+newChar); 
        }
    }
    public static void main(String args[]){
        String  str = "xyz";
        printPermutation(str, ""); 
    }
}
