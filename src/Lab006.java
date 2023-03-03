/**
 * @arthur Bryan Maus
 *
 * @version 1.0
 *
 * @param n     The number to be divided
 * @param m     The number to divide by
 * @return      Boolean value from isDivisible to main methods
 * The purpose of this program is to determine if two numbers entered by the user will be evenly divisible
 * by each number
 */
import java.util.Scanner;
public class Lab006 {
// n is the integer that will be divided, m is the integer that n will be divided by
    int m;
    int n;
// This is the constructor for this class and will associate the local variables with the instance variables
    public Lab006() {
        this.m = m;
        this.n = n;
        }
// This method will divide n using m and determine if there is a remainder, if
// there is a remainder it will return a false. If there is no remainder it will
// return true.
    public static boolean isDivisible(int n, int m){
        return (n % m == 0);
        }
// The main method will request two integer numbers from the user and then determine if the return is
// true or false. Depending on the return, it will print the answer to the screen for the user to see.
    public static void main(String[] args) {
        String not;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to be divided: ");
        int dvdnum = in.nextInt();
        System.out.print("Enter a number to divide by: ");
        int dvdbynum = in.nextInt();
        boolean answer = isDivisible(dvdnum, dvdbynum);
        if (answer) {
            not = "";
        }
        else {
            not = " not";
        }
        System.out.printf("%d is%s evenly divisible by %d",dvdnum,not ,dvdbynum);
    }
}
