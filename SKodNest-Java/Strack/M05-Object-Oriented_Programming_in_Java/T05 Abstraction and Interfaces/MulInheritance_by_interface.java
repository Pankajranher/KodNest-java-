interface Project {
    void doProject();
}

interface Work {
    void working();
}

class Employee implements Project, Work {
    @Override
    public void working() {
        System.out.println("Employee is working");
    }

    @Override
    public void doProject() {
        System.out.println("Employee doing project");
    }
}

public class MulInheritance_by_interface {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.working();
        emp.doProject();

    }

}
