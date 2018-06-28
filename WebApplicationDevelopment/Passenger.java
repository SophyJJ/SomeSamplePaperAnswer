package model;
import java.util.Date;
public class Passenger implements Comparable<Passenger>{
    private String idPassenger;
    private String firstName;
    private String lastName;
    private String nric;
    // [Blah.. Blah code..]

    public int compareTo(Passenger otherPassenger){
        return this.idPassenger.compareTo(otherPassenger.idPassenger);
    }
}