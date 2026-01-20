
/*
    4.
    
    Lee conducted a word game for his colleagues. The game is everyone should say a word that should not have any repeating characters in it. If a single character is repeated then the particular person can't continue the game. Lee finds it difficult to disqualify the person from the game since he is not able to find the nonrepetitive character for all the words. Help him to find the winner of the game by writing a program to find the first element which is non -repetitive i.e that element must not be present anywhere else in the string.

    Input Format
    The first line of the input consists of a string.
    Output Format
    The output displays a character that is non-repetitive. If all the characters in an input string are repetitive, then display All characters are repetitive.

    Sample Input:
    teeterson 
    Sample Output:
    r


 */
import java.util.Scanner;

public class RepetitiveChar {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter the Word to Find the Repetitive Char : ");
            String s = inp.next();
            String re = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (re.indexOf(c) != -1) {
                    // character already exists in re
                } else {
                    re += c;
                }
            }
            System.out.println(re);
        }
    }
}
