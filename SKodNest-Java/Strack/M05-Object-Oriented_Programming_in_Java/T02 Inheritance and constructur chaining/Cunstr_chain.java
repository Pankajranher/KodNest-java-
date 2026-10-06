public class parent {
    parent() {
        System.out.println("Inside the parent 0- parent cunstructor");
    }
}

public class Child extends parent {
    Child()
    {
        this
        System.out.println("Inside the child 0- child cunstructor");
    }
}

public class Cunstr_chain {
    public static void main(String[] args) {
        Child c1 = new Child();
    }

}