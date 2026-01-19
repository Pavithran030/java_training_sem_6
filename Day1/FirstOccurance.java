// package Day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstOccurance {

    public static void main(String[] args) {

        String st = "programming";
        Set<Character> ch = new LinkedHashSet<>();
        for (int i = 0; i < st.length(); i++) {
            ch.add(st.charAt(i));
        }
        for (Character c1 : ch) {
            System.out.print(c1);
        }

    }
}

//input : "programming"
//ouput : "progamin"
