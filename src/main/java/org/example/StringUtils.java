package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringUtils {

    public static Set<Character> findLetters (String[] strArray) {

        HashSet<Character> charactersOutput = new HashSet<>();

        int validStringCounter = 0; // amount of strings that complies the condition
        int stringCounter = 0; // counter for iteration over strArray

        while (validStringCounter < 2) {
            char[] charArray = strArray[stringCounter].toCharArray();

            HashMap<Character, Integer> symbolsCounted = new HashMap<>();
            for (int j = 0; j < charArray.length; j++) {
                if (symbolsCounted.containsKey(charArray[j])){
                    symbolsCounted.put(charArray[j], symbolsCounted.get(charArray[j]) + 1);
                }
                else {
                    symbolsCounted.put(charArray[j], 1);
                }
            }

            boolean hasOddSymbolsCount = false;
            for (Integer value : symbolsCounted.values()) {
                if (value % 2 != 0) {
                    hasOddSymbolsCount = true;
                    break;
                }
            }

            if (!hasOddSymbolsCount) {
                System.out.println("Letters of the " + (validStringCounter + 1) + " word");
                System.out.println(symbolsCounted.keySet());
                validStringCounter++;
                charactersOutput.addAll(symbolsCounted.keySet());
            }
            stringCounter++;
        }
        return charactersOutput;
   }



}
