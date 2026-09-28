class Book1 {
    private int pageNum;

    public void setData(int x) {
        pageNum = x;
    }

    public void getData() {
        System.out.println(pageNum);
    }
}

public class Incaps_imple {
    public static void main(String[] args) {
        Book1 b = new Book1();
        b.setData(-100);
        b.getData();
    }
}