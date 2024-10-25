package practicas;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //create
        //[1][2][3]
        String[] friendsArray = { "John", "Jane", "Jack", "Bob" };

        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("John", "Jane", "Jack", "Bob"));

        //get element
        System.out.println(friendsArray[1]);
        System.out.println("friendsArrayList = " + friendsArrayList);

        //get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        //add elements
        //it´s impossible with arrays, cause have a special size when it´s initializing
        friendsArrayList.add("Daniel");
        System.out.println(friendsArrayList.get(4));

         //Set an element//change a specific index
        friendsArray[0]="Dennis";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0,"Dennis");
        System.out.println(friendsArrayList.get(0));

        //Remove element
        //It´s impossible with arrays cause it count with a specific size
        friendsArrayList.remove("Dennis");
        System.out.println(friendsArrayList.get(0));

        //print
        System.out.println("friendsArray = " + friendsArray);
        System.out.println("friendsArrayList = " + friendsArrayList);


    }
}
