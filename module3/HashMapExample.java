import java.util.HashMap; 
import java.util.Map; 
public class HashMapExample {
    public static void HashMapCount(){
        String[] events = {"login", "login", "logout", "login", "error", "logout"}; 
 
            HashMap<String, Integer> counts = new HashMap<>(); 
            
            for (String event : events) { 
                counts.put(event, counts.getOrDefault(event, 0) + 1); 
            } 
            
            System.out.println(counts); 
            // {login=3, logout=2, error=1} 
    }
public static void main(String[] args) {
HashMapCount();
 
HashMap<String, String> userRoles = new HashMap<>(); 
 
userRoles.put("alice",   "admin"); 
userRoles.put("bob",     "viewer"); 
userRoles.put("charlie", "editor"); 
 
// Looking up a value by key 
String role = userRoles.get("alice");               // "admin" 
String missing = userRoles.get("nobody");           // null (not found) 
 
// Safer: provide a fallback if the key is not found 
String safe = userRoles.getOrDefault("nobody", "guest");  // "guest" 
 
// Checking whether a key exists 
boolean exists = userRoles.containsKey("bob");      // true 
 
// Looping over all pairs 
for (Map.Entry<String, String> entry : userRoles.entrySet()) { 
    System.out.println(entry.getKey() + " -> " + entry.getValue()); 
} 
}
}
