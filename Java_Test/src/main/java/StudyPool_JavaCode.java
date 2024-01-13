import java.util.Scanner;
public class StudyPool_JavaCode {


    public static void main(String[] args) {
            try {
                // Declare and initialize variables
                String firstName = getInput("Enter your first name: ");
                String lastName = getInput("Enter your last name: ");

                // Concatenate the variables
                String fullName = firstName + " " + lastName;

                // Write the message to the screen
                System.out.println("Hello, my name is " + fullName);
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        // Function to get user input with exception handling
        public static String getInput(String prompt) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Input cannot be empty.");
            }

            return input;
        }




}
