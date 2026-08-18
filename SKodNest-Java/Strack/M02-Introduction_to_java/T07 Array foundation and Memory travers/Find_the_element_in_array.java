class ArraySearch {
    void search(int ref[], int key) {
        boolean found = true;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element foud at index " + i);
                found = false;
                break;
            }
        }
        if (found == true) {
            System.out.println("Element Not foud in the array");
        }
    }
}

public class Find_the_element_in_array {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        ArraySearch as = new ArraySearch();
        as.search(arr, 50);
    }
}
