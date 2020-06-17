package local.nix.stringoperations.view.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataFileReader {

    private static final String PATH = "string-operations-view/src/main/resources/text.txt";
    private static File file = new File(PATH);


    public static String getDataFromFile() {

        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  result.toString();
    }

}
