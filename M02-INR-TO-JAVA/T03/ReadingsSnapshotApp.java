
public class ReadingsSnapshotApp {

    public static void main(String[] args) {
        // Assigned values
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        // 1. Create snapshot with the same length
        int[] snapshot = new int[readings.length];

        // 2. Copy each value from readings into snapshot using a loop
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        // 3. Replace readings[updateIndex] with newValue
        readings[updateIndex] = newValue;

        // 4. Print snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i]);
            if (i < snapshot.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // 5. Print updated readings
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i]);
            if (i < readings.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
