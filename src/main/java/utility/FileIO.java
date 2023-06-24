package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {
    private String file;
    public FileIO(String file){
        this.file = file;
    }
    public ArrayList<String> readFile(){
        ArrayList<String> output = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while((line = reader.readLine()) != null){
                output.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return output;
    }
}
