/**
 * Created by vkarande on 7/23/15.
 */
public class Search {
    public int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
