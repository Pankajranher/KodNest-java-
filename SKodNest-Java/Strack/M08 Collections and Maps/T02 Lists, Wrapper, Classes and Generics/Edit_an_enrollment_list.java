import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Edit_an_enrollment_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> courses = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            courses.add(sc.next());
        }
        int changeIndex = sc.nextInt();
        String newCourse = sc.next();
        int removeIndex = sc.nextInt();
        // TODO: replace the name at changeIndex
        courses.set(changeIndex, newCourse);

        // TODO: remove the element at removeIndex
        courses.remove(removeIndex);
        // TODO: print the List
        System.out.println(courses);

    }
}