/* Q. Find the number of ways in which you can invite n people to your party, single or in pair */
public class Guest_Single_Pair {
    public static int callGuest(int n){
        // Base case
        if(n<=1){
            return 1;
        }
        // Single call 
        int wayFirst = callGuest(n-1);
        // Pair Call
        int waySecond = (n-1)*callGuest(n-2);

        return wayFirst+waySecond;
    }
    public static void main(String[] args){
        int guest = 4;
        System.out.println("Total way to call the guest : "+callGuest(guest));
    }
}
