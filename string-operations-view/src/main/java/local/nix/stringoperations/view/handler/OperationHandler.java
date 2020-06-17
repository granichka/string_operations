package local.nix.stringoperations.view.handler;

import local.nix.stringoperations.util.StringOperationsUtil;
import local.nix.stringoperations.view.reader.DataFileReader;

import local.nix.stringoperations.view.viewer.StringOperationsUtilViewer;

import java.util.Map;

public class OperationHandler {

    private static String data = DataFileReader.getDataFromFile();

    public static void handleOperation(StringOperationsUtilViewer viewer, int numberOfOperation) {


            switch (numberOfOperation) {
                case 1:
                    Map<Character, Integer> result1 = StringOperationsUtil.uniqueCharactersCountingAndSorting(data);
                    viewer.viewResultOfUniqueCharactersCountingAndSorting(result1);
                    break;
                case 2:
                    Map<String, Integer> result2 = StringOperationsUtil.uniqueWordsCountingAndSorting(data);
                    viewer.viewResultOfUniqueWordsCountingAndSorting(result2);
                    break;
                case 3:
                    StringBuilder result3 = StringOperationsUtil.reverseOfWords(data);
                    viewer.viewResultOfReverseOfWords(result3);
                    break;
            }

    }
}
