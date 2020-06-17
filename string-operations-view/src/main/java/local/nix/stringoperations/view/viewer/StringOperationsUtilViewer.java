package local.nix.stringoperations.view.viewer;

import java.util.Map;

public interface StringOperationsUtilViewer {

    void viewResultOfUniqueCharactersCountingAndSorting(Map<Character, Integer> readyData);
    void viewResultOfUniqueWordsCountingAndSorting(Map<String, Integer> readyData);
    void viewResultOfReverseOfWords(StringBuilder readyData);
}
