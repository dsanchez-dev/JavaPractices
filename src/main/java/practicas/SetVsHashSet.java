package practicas;

import java.util.*;

public class SetVsHashSet {
    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();

        names.add("Daniel");
        names.add("John");
        names.add("Michael");
        names.add("Saul");
        names.add("Mike");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        List<String> numberList = new ArrayList<>();
        numberList.add("1");
        numberList.add("2");
        numberList.add("3");
        numberList.add("2");
        numberList.add("1");
        System.out.println("numberList = " + numberList);


        Set<String> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println("numberSet = " + numberSet);


    }
}