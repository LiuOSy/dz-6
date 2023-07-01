package org.example;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Character> res = StringUtils.findLetters(new String[] {"row0", "row1row1", "row2row2", "row3row3"});
        System.out.println("\nResult: " + res);
    }
}