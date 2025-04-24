import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt"; // Replace this with your file name or path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}