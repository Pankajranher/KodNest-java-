abstract class employee {
    int id;
    String name;
    double salary;

    static String ComanyName = "KodNest";
    static int empCount = 0;

    employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        empCount++;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());

    }

    String getRole() {
        return "Employee";
    }

    static void showRole() {
        System.out.println("Employee Role");
    }

}

class Developer extends employee {

    int bonus = 5000;

    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        double totalsalary = salary + bonus;
        return totalsalary;

    }

    @Override
    String getRole() {
        return "Developer";
    }

    static void showRole() {
        System.out.println("Developer Role");

    }

}

class Trainer extends employee {
    int allowance = 3000;

    Trainer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        double totalsalary = salary + allowance;
        return totalsalary;
    }

    @Override
    String getRole() {
        return "Treiner";
    }

    static void showRole() {
        System.out.println("Trainer Role");
    }
}

public class Emp_payroll_system {
    public static void main(String[] args) {
        System.out.println("Hello");
        employee emp = new Trainer(101, "Rahul", 40000);
        emp.calculateSalary();

        employee emp2 = new Developer(102, "Pankaj", 35000);
        emp2.calculateSalary();

        System.out.println("Company: " + emp.ComanyName);
        emp.displayDetails();
        System.out.println();

        emp2.displayDetails();
        System.out.println();

        System.out.println("Total employees: " + employee.empCount);

        employee.showRole();
        Developer.showRole();
        Trainer.showRole();

    }

}
