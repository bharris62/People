/**
 * Created by BHarris on 2/13/17.
 */
public class People implements Comparable{
    String id;
    String first_name;
    String last_name;
    String email;
    String country;
    String ip_address;

    public People(){}

    public People(String id, String first_name, String last_name, String email, String country, String ip_address){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }

    @Override
    public int compareTo(Object o) {
        People otherPerson = (People) o;
        return this.last_name.compareTo(otherPerson.last_name);
    }

    @Override
    public String toString() {
        return String.format("%s %s from %s", this.first_name, this.last_name, this.country);
    }
}
