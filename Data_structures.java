import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataManipulationExample {
    public static void main(String[] args) {
        // Arrays
        int[] integerArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry", "date"};

        System.out.println("Integer Array: " + Arrays.toString(integerArray));
        System.out.println("String Array: " + Arrays.toString(stringArray));

        // ArrayList
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);

        List<String> stringList = new ArrayList<>();
        stringList.add("fig");
        stringList.add("grape");
        stringList.add("honeydew");

        System.out.println("Integer List: " + integerList);
        System.out.println("String List: " + stringList);

        // Basic Data Structures: Set and Map
        Set<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");

        Map<String, Integer> stringToValue = new HashMap<>();
        stringToValue.put("apple", 10);
        stringToValue.put("banana", 20);
        stringToValue.put("cherry", 30);

        System.out.println("String Set: " + stringSet);
        System.out.println("String to Value Map: " + stringToValue);

        // String Manipulation
        String originalString = "Hello, World!";
        String upperCaseString = originalString.toUpperCase();
        String substring = originalString.substring(0, 5);

        System.out.println("Original String: " + originalString);
        System.out.println("Uppercase String: " + upperCaseString);
        System.out.println("Substring: " + substring);
    }
}
