class Freq {
    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println(key + ":" + count);

    }
}

class Frequency_and_duplicates {
    public static void main(String[] args) {
        int[] arr = { 30, 40, 40, 30, 50, 60, 40 };
        Freq fs = new Freq();
        fs.count(arr, 60);

    }
}