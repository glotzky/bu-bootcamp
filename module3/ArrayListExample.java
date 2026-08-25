import java.util.ArrayList; 

public class ArrayListExample { 
    public static void main(String[] args) {
        ArrayList<String> servers = new ArrayList<>(); 
        
        servers.add("web-01");      // adds to the end 
        servers.add("web-02"); 
        servers.add("db-01"); 
        
        System.out.println(servers.get(0));       // web-01 
        System.out.println(servers.get(2));       // db-01 
        System.out.println(servers.size());       // 3 
        
        servers.remove("web-02");                 // removes by value 
        System.out.println(servers.size());       // 2 
        
        for (String server : servers) {           // loop over all items 
            System.out.println(server); 
        } 
    }
}