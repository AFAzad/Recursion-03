public class Recursion {
    /*Print the program n to 1 */

    static void func(int n){
        if(n>0){
            System.out.println(n);
            func(n-1);
        }
    }

    // factorial of a number

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    public static void main(String args[]){
        int nos = 5;
        int num = 5; // factorial of 5 = 5 * 4 * 3 * 2 * 1

        System.out.println("The factorial of num is: "+factorial(num));
        func(nos);
    }
}
