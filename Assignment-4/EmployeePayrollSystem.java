import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        String empID = scanner.nextLine();
        
        System.out.print("Enter salary: ");
        String sal = scanner.nextLine();

        System.out.print("Enter bonus amount: ");
        String bonus = scanner.nextLine();

        Double doublesal = Double.valueOf(sal);
        Double doublebonus = Double.valueOf(bonus);

        double sal_double = doublesal;
        double bonus_double = doublebonus;

        double total_sal = sal_double + bonus_double;

        System.out.println("\n--- Payroll Details ---");
        System.out.println("Employee ID: " + empID);
        System.out.println("Total Salary: " + total_sal);

        scanner.close();
    }
    
}
