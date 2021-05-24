package Banana;

import java.util.*;

public class Banana {

    public static void main( String[ ] args ) {

        String[] banana={"B", "A", "N", "A", "N","A"};
        Set<String> noRepeated = new HashSet<>();
        for(String a: banana) {
            noRepeated.add(a);
        }
        System.out.println("The list of characters without duplication is: " );
        System.out.print(noRepeated);
    }
}