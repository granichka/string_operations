package local.nix.stringoperations.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOperationsUtil {

    public static Map<Character, Integer> uniqueCharactersCountingAndSorting(String string) {

        Map<Character, Integer> characters = new HashMap<Character, Integer>();

        for(int i = 0; i < string.length(); i++) {
            if(characters.containsKey(string.charAt(i))) {
                int currentValue = characters.get(string.charAt(i)).intValue();
                int newValue = ++currentValue;
                characters.put(string.charAt(i), newValue);
            } else {
                characters.put(string.charAt(i), 1);
            }
        }

        Map<Character, Integer> result = new LinkedHashMap<>();
        characters.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        return result;

    }


    public static Map<String, Integer> uniqueWordsCountingAndSorting(String string) {


        String[] resultOfSpliting = splitToWords(string);
        Map<String, Integer> words = new HashMap<String, Integer>();

        for(int i = 0; i < resultOfSpliting.length; i++) {
            String currentWord = resultOfSpliting[i].toLowerCase();
            if(words.containsKey(currentWord)) {
                int currentValue = words.get(currentWord).intValue();
                int newValue = ++currentValue;
                words.put(resultOfSpliting[i], newValue);
            } else {
                words.put(currentWord, 1);
            }
        }

        Map<String, Integer> result = new LinkedHashMap<>();
        words.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        return result;
    }

    public static String[] splitToWords(String string) {


        String[] words = string.split("(\\s)*[?!.,;:-]*(\\s)[(]*[\"]*");
        for(int i = 0; i < words.length; i++) {
            if(words[i].contains(".") || words[i].contains("!") || words[i].contains("?") || words[i].contains(";") || words[i].contains(")") || words[i].contains(")!") || words[i].contains(").") || words[i].contains(")?") || words[i].contains("\"")) {
                String[] arr = words[i].split("[?!.,;)]+|[\"]");
                words[i] = arr[0];

            }

        }


        return words;

    }

    public static StringBuilder reverseOfWords(String string) {

        StringBuilder result = new StringBuilder();
        String[] sentences = string.split("[?!.;](\\s)*");

        for(String sentence: sentences) {

            String[] wordsOfSentence = splitToWords(sentence);

            for(int i = 0; i < wordsOfSentence.length/2; i++) {

                String t = wordsOfSentence[i];
                wordsOfSentence[i] = wordsOfSentence[wordsOfSentence.length-1-i];
                wordsOfSentence[wordsOfSentence.length-1-i] = t;

            }


            for(int i = 0; i < wordsOfSentence.length; i++) {
                result.append(wordsOfSentence[i] + " ");
            }

            result.append("\n");
        }

        return result;
    }

}
