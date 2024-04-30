import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[/,]");
                double num1 = Double.parseDouble(parts[0]);
                double num2 = Double.parseDouble(parts[2]);
                char operator = parts[1].charAt(0);
                double result;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Error: Invalid operator!");
                        continue;
                }
                System.out.println("Result: " + result);
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in input file.");
        }
    }
}
