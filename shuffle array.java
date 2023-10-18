import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffleArray {
    public static void main(String[] args) {
        // Create the array
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        // Shuffle the array
        Collections.shuffle(arrayList);

        // Print the shuffled array
        System.out.println(arrayList);
    }
}
