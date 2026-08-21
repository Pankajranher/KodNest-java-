import java.util.Scanner;

class Employee {
    int employeeld;
    String employeeName;
    double basicSalary;
    double bonus;

    Employee() {
        this.employeeld = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    Employee(int employeeld, String employeeName, double basicSalary, double bonus) {
        this.employeeld = employeeld;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void setEmployeeDetails(int employeeld, String employeeName, double basicSalary) {
        this.employeeld = employeeld;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    void addBonus(double bonusAmount) {
        this.bonus = this.bonus + bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = this.basicSalary * bonusPercentage / 100;
        double additionalBonus = percentageBonus + extraReward;
        this.bonus = this.bonus + additionalBonus;
    }

    double calculateTotalSalary() {
        double totalSalary = this.basicSalary + this.bonus;
        return totalSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + this.employeeld);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class Employee_payroll_management_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeld1 = scanner.nextInt();
        scanner.nextLine();
        String employeeName1 = scanner.nextLine();
        double basicSalary1 = scanner.nextDouble();
        double fixedBonus = scanner.nextDouble();

        Employee employee1 = new Employee();
        employee1.setEmployeeDetails(employeeld1, employeeName1, basicSalary1);
        employee1.addBonus(fixedBonus);

        int employeeld2 = scanner.nextInt();
        scanner.nextLine();
        String employeeName2 = scanner.nextLine();
        double basicSalary2 = scanner.nextDouble();
        double initialBonus = scanner.nextDouble();
        double bonusPercentage = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        Employee employee2 = new Employee(employeeld2, employeeName2, basicSalary2, initialBonus);
        employee2.addBonus(bonusPercentage, extraReward);

        System.out.println("Employee 1");
        employee1.displayEmployee();

        System.out.println();

        System.out.println("Employee 2");
        employee2.displayEmployee();

        scanner.close();
    }
}