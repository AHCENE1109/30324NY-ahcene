package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> list = new ArrayList<>();
        // How to add to arrayList
        list.add("Be");
        list.add("The");
        list.add("Person");
        list.add("That");
        list.add("Biba");
        list.add("Wants");
        list.add("To");
        list.add("See");
        // Displaying the list
        System.out.println("*** The list is: \n *** " + list);

        // Create an iterator for the list by using iterator() method
        Iterator<String> iter = list.iterator();
        // Display the list value after iterating through the list
        System.out.println("\nThe iterator values" + "of list are : ");{

        }
        while (iter.hasNext()){ //Boolean condition === if next string value had defined data return true
                // while identify string variable with defined data "what we need"
        System.out.println(iter.next()+ " ");


    }
            String arr[]= {" ", " - George washington -"};
            for(String str : arr){
           System.out.println(str);
           }

           }



}
