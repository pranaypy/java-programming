import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegisteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        System.out.println("--- Student Course Registration System ---");

        System.out.print("Enter name of Student: ");
        String name = scanner.nextLine();

        System.out.printf("Enter PRN of %s: ", name);
        String prn = scanner.nextLine();

        boolean running = true;

        while (running) {
            System.out.print("Enter choice (add, remove, view, exit): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "add":
                    System.out.print("Enter course name to add: ");
                    String courseToAdd = scanner.nextLine();
                    courses.add(courseToAdd);
                    System.out.printf("Course %s added successfully!\n", courseToAdd);
                    break;

                case "remove":
                    if (courses.isEmpty()) {
                        System.out.println("No courses registered yet to remove");
                        break;
                    }
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = scanner.nextLine();

                    if (courses.remove(courseToRemove)) {
                        System.out.printf("Course %s removed successfully!\n", courseToRemove);
                    } 
                    else {
                        System.out.println("Course not found in registered list.");
                    }
                    break;

                case "view":
                    StringBuffer viewDetails = new StringBuffer();
                    viewDetails.append("\n--- Student Details ---\n");
                    viewDetails.append("Name : ").append(name).append("\n");
                    viewDetails.append("PRN  : ").append(prn).append("\n");
                    viewDetails.append("Registered Courses:\n");

                    int total_courses = courses.size();

                    if (courses.isEmpty()) {
                        viewDetails.append("  (No courses registered)\n");
                    } 
                    else {
                        for (int i = 0; i < total_courses; i++) {
                            viewDetails.append("  ").append(i + 1).append(". ").append(courses.get(i)).append("\n");
                        }
                    }
                    System.out.print(viewDetails);
                    break;

                case "exit":
                    running = false;
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}