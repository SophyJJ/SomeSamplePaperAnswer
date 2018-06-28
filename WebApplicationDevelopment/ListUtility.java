package bizlogic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Passenger;

public class ListUtility {

    private ArrayList<Passenger> arrangePassengerById (List<Passenger> givenList){
        Collections.sort(givenList);
        return givenList;
    }

    private Passenger findFirstPassenger (ArrayList<Passenger> givenList){
        return givenList.get(0);
    }

    private Passenger findLastPassenger (ArrayList<Passenger> givenList){
        int lastIndex = givenList.size() - 1;
        return givenList.get(lastIndex);
    }

    public static void main(Strings args[]){
        ListUtility prg = new ListUtility();
        ArrayList<Passenger> originalList =
        new ArrayList<Passenger>();
        // Use constructor to create instance
        Passenger p1 = new Passenger (. . . );
        Passenger p2 = new Passenger (. . . );
        Passenger p3 = new Passenger (. . . );
        originalList.add(p1);
        originalList.add(p2);
        originalList.add(p3);
        System.out.println("ORIGINAL LIST");
        for (Passenger passenger : originalList) {
            System.out.println(passenger.toString());
            }
        originalList = originalList.arrangePassengerById(originalList);
        System.out.println("SORTED LIST");
        for (Passenger passenger : originalList) {
            System.out.println(passenger.toString());
            }
        Passenger first = prg.findFirstPassenger(originalList);
        Passenger last = prg.findLastPassenger(originalList);
        System.out.println("FIRST ITEM" + first.toString());
        System.out.println("LAST ITEM" + last.toString());
    }
}