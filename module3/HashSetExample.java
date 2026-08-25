import java.util.HashSet; 
import java.util.ArrayList; 
public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<String> visited = new HashSet<>(); 
        
        visited.add("/home"); 
        visited.add("/about"); 
        visited.add("/home");   // duplicate: silently ignored 
        
        System.out.println(visited.size());              // 2, not 3 
        System.out.println(visited.contains("/home"));  // true 
        System.out.println(visited.contains("/shop"));  // false 
        
        // Remove duplicates from an ArrayList in one line: 
        ArrayList<String> withDuplicates = new ArrayList<>(); 
        withDuplicates.add("Apple");
        withDuplicates.add("Banana");
        withDuplicates.add("Apple");
        System.out.println(withDuplicates);  // prints all values, including duplicates
        // ... fill it with repeated values ... 
        HashSet<String> uniqueOnly = new HashSet<>(withDuplicates); 
        System.out.println(uniqueOnly);  // prints only the unique values
        } 
    }
