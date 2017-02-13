import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Global sort = new Global();
        Scanner scanner = loadFile();
        sort.addToMap(scanner);

    }

    private static Scanner loadFile() throws FileNotFoundException {
        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        return scanner;
    }


    static void saveFile(String letter) throws IOException {

        File f = new File(letter + "people.json");
        FileWriter fw = new FileWriter(f);

        //fw.write();

        //fw.close();
    }
}

