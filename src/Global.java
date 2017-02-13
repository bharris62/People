import java.util.*;

/**
 * Created by BHarris on 2/13/17.
 */
public class Global {
    HashMap<String, ArrayList<People>> globe = new HashMap<>();

    public void addToMap(Scanner scanner) {
        ArrayList<People> persons = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            //0 id; 1 first_name; 2 last_name; 3 email; 4 country; 5 ip_address
            String[] c = line.split(",");
            if (globe.containsKey(c[4])) {

                People p = new People(c[0], c[1], c[2], c[3], c[4], c[5]);                                                                  //add to the existing array, or create one
                globe.get(c[4]).add(p);
            } else {

                persons = new ArrayList<>();
                persons.add(new People(c[0], c[1], c[2], c[3], c[4], c[5]));
                globe.put(c[4], persons);
            }

        }
        sortMap();

        for (String country : globe.keySet()) {

            String key = country.toString();
            System.out.printf("%-8s", key + ": ");
            for (People letter : globe.get(country)) {

                System.out.print(letter.first_name + " " + letter.last_name + " |");

            }


            System.out.println();
        }
    }

        public void sortMap(){
            for (Map.Entry<String, ArrayList<People>> entry : globe.entrySet()) {
                Collections.sort(entry.getValue());
            }
    }

}