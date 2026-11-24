import java.util.*;

class ListT02 {
    public static void main(String[] args) {
        // insert, update, remove list elements
        List<String> name = new ArrayList();
        name.add("Anu");
        name.add("Banu");
        System.out.println(name);
        name.add(1, "Ravi");
        System.out.println(name);
        name.add(1, "Ravi B S");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);

    }
}
