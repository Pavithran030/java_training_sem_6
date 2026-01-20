
import java.util.*;

public class SentenceReverse {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter the Sentence : ");
            String s = inp.nextLine();
            String[] ls = s.split(" ");

            int si = ls.length;
            for (int i = si - 1; i >= 0; i--) {
                System.out.print(ls[i] + " ");
            }
        }
    }
}


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

    5. Wordakshari

    Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. The first player has to recite a word. The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning team is decided by a process of elimination. The person or the team that cannot come up with a word with the right consonant is eliminated. - The following rules need to be followed while playing this game. - (i) All other words except the first word have to begin with the last letter of the previous word - (ii) No words can be repeated. write a program to print the wordakshari chain.
    Input Format
    Input consists of n+1 lines.
    The first n lines contain strings corresponding to the words in the chain.
    The last line of input contains the string #### to mark the end of the input.
    Output Format
    The output consists of the valid wordakshari chain.

    Sample Input:
    oracle error rohit #### 
    Sample Output:
    oracle error rohit 

    Explanation:
    In oracle the last letter is e and so the next word will be error since it starts with e and it goes on like that and hence the output is
    oracle
    error
    rohit



 */
