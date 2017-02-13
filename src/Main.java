import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Global global = new Global();
        Scanner scanner = loadFile();
        global.addToMap(scanner);
        global.sortMap();
        global.printMap();
        saveFile();

    }

    private static Scanner loadFile() throws FileNotFoundException {
        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        return scanner;
    }


    static void saveFile() throws IOException {

        //Global global = new Global();
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer
                .include("*")
                .serialize(Global.globe);

        File f = new File("people.json");
        FileWriter fw = new FileWriter(f);

        fw.write(json);
        fw.close();
    }
}

