/**
 * Created by BHarris on 2/13/17.
 */
public class Person implements Comparable{
    String id;
    String first_name;
    String last_name;
    String email;
    String country;
    String ip_address;

    public Person(){}

    public Person(String id, String first_name, String last_name, String email, String country, String ip_address){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }

    @Override
    public int compareTo(Object o) {
        Person otherPerson = (Person) o;
        return this.last_name.compareTo(otherPerson.last_name);
    }

    @Override
    public String toString() {
        return String.format(first_name + " " + last_name + " from " + country + "! ");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}
