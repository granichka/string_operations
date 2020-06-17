package local.nix.stringoperations.view.viewer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;

public class FileViewer implements StringOperationsUtilViewer{

    File result = new File("string-operations-view/src/main/resources/result.txt");

    @Override
    public void viewResultOfUniqueCharactersCountingAndSorting(Map<Character, Integer> readyData) {

        try(BufferedWriter writter = new BufferedWriter(new FileWriter(result))) {

            readyData.entrySet()
                    .stream()
                    .forEach(entry -> {
                        try {
                            writter.write(entry.getKey().toString() + " = " + entry.getValue().toString() + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void viewResultOfUniqueWordsCountingAndSorting(Map<String, Integer> readyData) {

        try(BufferedWriter writter = new BufferedWriter(new FileWriter(result))) {

            readyData.entrySet()
                    .stream()
                    .forEach(entry -> {
                        try {
                            writter.write(entry.getKey().toString() + " = " + entry.getValue().toString() + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void viewResultOfReverseOfWords(StringBuilder readyData) {

        try(BufferedWriter writter = new BufferedWriter(new FileWriter(result))) {

                writter.write(readyData.toString());

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
