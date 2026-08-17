public class Debug_and_trace_array_state_change {
    public static void main(String[] args) {
        int[] original = { 14, 18, 22, 26 };
        // write thte required variables as given
        int updateIndex = 1;
        int updateValue = 25;
        int requestIndex = 4;

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }
        int[] liveView = original;

        // Update through liveView.
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updateValue;
        }
        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (original == liveView));
        // Validate requestedIndex before accessing original.
        System.out.print("Requested value: ");
        if (requestIndex >= 0 && requestIndex < original.length) {
            System.out.print(original[requestIndex]);
        } else {
            System.out.println("Invalid index");

        }

    }
}