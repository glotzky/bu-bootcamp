import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class FileReaderExample {
    public static void main(String[] args) {
        String filename = "numbers.txt";
 
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                double amount = Double.parseDouble(line);  // String to double
                System.out.println(amount);
            }
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
} 