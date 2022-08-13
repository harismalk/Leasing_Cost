/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 * Haris Malik
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n == 0) {
            return original;
        } else {
            return original + appendNTimes(original, n-1);
        }
        
	// WRITE YOUR CODE HERE
    }

    public static void main (String[] args) {
        String original = args[0];
        int n = Integer.parseInt(args[1]);
        String print = appendNTimes(original, n-1);
        System.out.print(print);
	// WRITE TEST CASES HERE to test your method
    }
}
