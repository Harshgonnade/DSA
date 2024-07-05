package Assignment2;

import java.util.Scanner;

// que2
public class SameStartEndSubstrings {

    public static int countSameStartEndSubstrings(String str) {
        int count = 0;
        int n = str.length();
        
        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Check if the starting and ending characters are the same
                if (str.charAt(i) == str.charAt(j)) 
                {
                    System.out.println(str.charAt(i)+" "+str.charAt(j));
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter string to cheak ");
        String str = sc.next();
        int count = countSameStartEndSubstrings(str);
        System.out.println("Number of substrings with the same starting and ending characters: " + count);
        
    }
}
