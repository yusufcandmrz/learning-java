import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // ArrayList vs LinkedList
        ArrayList<String> arrayListNames = new ArrayList<>();
        arrayListNames.add("Yusuf");
        arrayListNames.add("Taha");
        arrayListNames.add("Huseyin");
        arrayListNames.add("Muhammet");
        arrayListNames.add("Sait");

        LinkedList<String> linkedListNames = new LinkedList<>();
        linkedListNames.add("Yusuf");
        linkedListNames.add("Taha");
        linkedListNames.add("Huseyin");
        linkedListNames.add("Muhammet");
        linkedListNames.add("Sait");

        /* long startCurrentMillis = System.currentTimeMillis();
        System.out.println(arrayListNames.getFirst());
        long endCurrentMillis = System.currentTimeMillis();
        System.out.println("getFirst result: " + (endCurrentMillis - startCurrentMillis));

        long startCurrentMillisTwo = System.currentTimeMillis();
        System.out.println(arrayListNames.get(0));
        long endCurrentMillisTwo = System.currentTimeMillis();
        System.out.println("get(0) result: " + (endCurrentMillisTwo - startCurrentMillisTwo)); */

        /* long startCurrentMillis = System.currentTimeMillis();
        arrayListNames.add(1,"Can");
        long endCurrentMillis = System.currentTimeMillis();
        System.out.println("arrayListNames.add: " + (endCurrentMillis - startCurrentMillis));

        long startCurrentMillisTwo = System.currentTimeMillis();
        linkedListNames.add(1,"Can");
        long endCurrentMillisTwo = System.currentTimeMillis();
        System.out.println("linkedListNames.add: " + (endCurrentMillisTwo - startCurrentMillisTwo)); */
    }
}