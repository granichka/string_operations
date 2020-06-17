package local.nix.stringoperations.view.viewer;

import java.util.Map;

public class ConsoleViewer implements StringOperationsUtilViewer{

    @Override
    public void viewResultOfUniqueCharactersCountingAndSorting(Map<Character, Integer> readyData) {
        readyData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }

    @Override
    public void viewResultOfUniqueWordsCountingAndSorting(Map<String, Integer> readyData) {
        readyData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }

    @Override
    public void viewResultOfReverseOfWords(StringBuilder readyData) {
        System.out.println(readyData);
    }
}
