import java.util.*; 
public class ContactManager { 
    
    public static void contactLookup(HashMap<String, Contact> contacts, String name) {  
        if (contacts.containsKey(name)) { 
            System.out.println(contacts.get(name));
        } else { 
            System.out.println("Contact not found.");
        } 
    }
    public static void main(String[] args) { 
 
        HashMap<String, Contact> contacts = new HashMap<>(); 
 
        // Step 4: add contacts here 
        contacts.put("Ada Lovelace", new Contact("Ada Lovelace", "+1 617 555 0101"));
        contacts.put("Gil Lotzky", new Contact("Gil Lotzky","+1 555 123 9999"));
        contacts.put("Couscous ThaDog", new Contact("Couscous ThaDog","+1 555 444 3206"));
        contacts.put("Rachel R", new Contact("Rachel R","+1 555 123 2000"));
        contacts.put("Steve B", new Contact("Steve B","+1 222 867 5309"));

        // Step 5: look up a contact 
        System.out.println(contacts.get("Ada Lovelace"));
        //if object is null then have fallback print statement of Contact not found.
        contactLookup(contacts, "Ada Lovelace");
        contactLookup(contacts, "John Mayer");
        contactLookup(contacts, "Couscous ThaDog");
        // Step 6: print sorted list
        ArrayList<Contact> sorted = new ArrayList<>(contacts.values()); 
        sorted.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("=== All Contacts ===  ");
        for (Contact contact : sorted) {
            System.out.println(contact);
        }
    } 
}