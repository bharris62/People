import java.util.*;

/**
 * Created by BHarris on 2/13/17.
 */
public class Global {
    HashMap<String, ArrayList<People>> globe = new HashMap<>();

    public void addToMap(Scanner scanner) {
        ArrayList<People> persons = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();                                     //Gather information
            //0 id; 1 first_name; 2 last_name; 3 email; 4 country; 5 ip_address   //
            String[] c = line.split(",");                                  //split line by comma

            if (globe.containsKey(c[4])) {

                People p = new People(c[0], c[1], c[2], c[3], c[4], c[5]);                                                                  //add to the existing array, or create one
                globe.get(c[4]).add(p);
                //globe.put(c[4], persons);                                        //update the hashmap to reflect changes

            } else {                                                             //if the value doesn't exist already
                persons = new ArrayList<>();                                     //create a new persons aray to hold the people from there
                persons.add(new People(c[0], c[1], c[2], c[3], c[4], c[5]));     //add the people to the new array
                globe.put(c[4], persons);                                        //update the globe to reflect changes.
            }
        }



        for (String name : globe.keySet()) {
            String key = name.toString();
            System.out.printf("%-8s", key + ": ");
            Collections.sort(persons);
            for (People letter : globe.get(name)) {
                System.out.print(letter.first_name + " " + letter.last_name + " |");
            }
            System.out.println();
        }
    }
}