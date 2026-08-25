
public class ArraySnapshotApp {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updatedIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;

        if (updatedIndex >= 0 && updatedIndex < liveView.length) {
            liveView[updatedIndex] = updatedValue;
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + (i == original.length - 1 ? "" : " "));
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + (i == snapshot.length - 1 ? "" : " "));
        }
        System.out.println();

        System.out.println("Same object: " + (liveView == original));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
