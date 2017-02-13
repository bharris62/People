import java.util.*;

/**
 * Created by BHarris on 2/13/17.
 */
public class Global {
    static Map<String, ArrayList<Person>> globe = new HashMap<>();

    public Global(){

    }


    public void addToMap(Scanner scanner) {
        ArrayList<Person> persons = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            //0 id; 1 first_name; 2 last_name; 3 email; 4 country; 5 ip_address
            String[] c = line.split(",");
            Person p = new Person(c[0], c[1], c[2], c[3], c[4], c[5]);
            if (globe.containsKey(c[4])) {
                globe.get(c[4]).add(p);
            } else {

                persons = new ArrayList<>();
                persons.add(new Person(c[0], c[1], c[2], c[3], c[4], c[5]));
                globe.put(c[4], persons);
            }
        }
    }


    public void printMap() {
        for (String country : globe.keySet()) {

            String key = country.toString();
            System.out.printf("%-8s", key + ": ");
            for (Person letter : globe.get(country)) {

                System.out.print(letter);

            }

            System.out.println();
        }
    }

    public void sortMap(){
            for (Map.Entry<String, ArrayList<Person>> entry : globe.entrySet()) {
                Collections.sort(entry.getValue());
            }
    }

    public Map<String, ArrayList<Person>> getGlobe() {
        return globe;
    }

    public void setGlobe(HashMap<String, ArrayList<Person>> globe) {
        this.globe = globe;
    }
}