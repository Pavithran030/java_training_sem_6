
import java.util.Scanner;

/*
5. Wordakshari

    Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. The first player has to recite a word. The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning team is decided by a process of elimination. The person or the team that cannot come up with a word with the right consonant is eliminated. - The following rules need to be followed while playing this game. - 
    
    (i) All other words except the first word have to begin with the last letter of the previous word - 
    
    (ii) No words can be repeated. write a program to print the wordakshari chain.

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
public class WordChain {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            String st = inp.nextLine();
            String[] lst = st.split(" ");
            int size = lst.length;

            for (int i = 0; i < size; i++) {
                String temp = lst[i];
                int templen = temp.length();
                char[] last = new char[2];

                char[] store = new char[size];
                last[0] = lst[i].charAt(0);
                last[1] = lst[i].charAt(templen - 1);
                store[i] = last[0];
                boolean tr = false;

                if (store.contains(last[0]))

            }
        }
    }

}
