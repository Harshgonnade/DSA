package Assignment1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumberFinder {

	 public static boolean isHappy(int num) {
	        Set<Integer> seen = new HashSet<>();

	        while (num != 1 && !seen.contains(num)) {
	            seen.add(num);
	            num = sumOfSquaresOfDigits(num);
	        }

	        return num == 1;
	    }

	    public static int sumOfSquaresOfDigits(int num) {
	        int sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit * digit;
	            num /= 10;
	        }
	        return sum;
	    }

	    public static void findHappyNumbers(int start, int end) {
	        for (int i = start; i <= end; i++) {
	            if (isHappy(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int start = 1;
	        int end = 100; // Adjust this as needed

	        System.out.println("Happy numbers within the interval:");
	        findHappyNumbers(start, end);
	    }
}
