import java.util.Stack; 
public class StackExample {
public static void main(String[] args){ 
Stack<String> history = new Stack<>(); 
 
history.push("/home"); 
history.push("/products"); 
history.push("/cart"); 
 
System.out.println(history.peek());  // /cart  (look without removing) 
System.out.println(history.pop());   // /cart  (removes and returns) 
System.out.println(history.pop());   // /products 
System.out.println(history.peek());  // /home 
 
System.out.println(history.isEmpty()); // false 
System.out.println(history.pop());   // /home 
System.out.println(history.isEmpty()); // true 

history.push("/Gil");
history.push("/Rachel");
history.push("/Couscous");

System.out.println(history.peek()); //Couscous
System.out.println(history.pop()); // Couscous
System.out.println(history.peek()); //Rachel
}
}
