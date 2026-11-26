import java.util.HashSet;

import java.util.

class Student extends {
    int roll;
    String name;

    Student (int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    @Override 

}

public class StudentAppIMP {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Anu");
        Student s2 = new Student(12, "Raja");
        Student s3 = new Student(11, "anu");
        HashSet hs = new HashSet<>();

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);

    }
}
