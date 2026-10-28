import java.util.Scanner;

class Teacher {
    // Add name field, constructor and getter
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class School {
    // Store school name and Teacher
    private String schoolName;
    private Teacher teacher;

    public School(String schoolName, Teacher teacher) {
        this.schoolName = schoolName;
        this.teacher = teacher;
    }

    public void displayTeacher() {
        System.out.println(schoolName + " has teacher " + teacher.getName());
    }
}

public class School_has_a_teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String schoolName = scanner.nextLine();
        String teacherName = scanner.nextLine();

        // Create Teacher, then School
        Teacher teacher = new Teacher(teacherName);
        School school = new School(schoolName, teacher);

        school.displayTeacher();
    }
}