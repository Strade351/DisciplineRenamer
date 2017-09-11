import java.io.*;
import java.util.ArrayList;

/**
 * Created by Anatoliy on 11.09.2017.
 */
public class Renamer {
    ArrayList<Note> notes = new ArrayList<Note>();

    void readCSV() {
        File file = new File("Annot.csv");
        try {
            FileInputStream fstream = null;
            fstream = new FileInputStream(file);            
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String string;
            while ((string = br.readLine()) != null) {
                if (!string.startsWith("№")) {
                    String[] parts;
                    parts = string.split(";");
                    if (parts.length == 5) {
                        notes.add(new Note(parts[4], parts[2]));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
