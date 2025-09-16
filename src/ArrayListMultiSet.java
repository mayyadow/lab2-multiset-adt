import java.util.ArrayList;

public class ArrayListMultiSet extends MultiSet {

    // this ArrayList object is a private instance variable for this class.
    private final ArrayList<Integer> lst = new ArrayList<>();

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(int item) {
        lst.add(item);
    }

    /**
     * Remove the given item from this multiset.
     * If the item isn't in the multiset, do nothing.
     *
     * @param item the item to remove
     */
    @Override
    void remove(int item) {
        for (int i = lst.size()-1; i >= 0; i--) {
            if (lst.get(i) == item) {
                lst.remove(i);
                break;
            }
        }
    }

    /**
     * Check whether item is in this multiset.
     *
     * @param item the item to check if in this multiset
     * @return True if item is in this multiset and False otherwise.
     */
    @Override
    boolean contains(int item) {
        return lst.contains(item);
    }

    /**
     * @return True if this multiset is empty.
     */
    @Override
    boolean isEmpty() {
        return lst.isEmpty();
    }

    /**
     * Count how many times the given item appears in this multiset.
     *
     * @param item the item to count
     * @return How many times item appears in this multiset.
     */
    @Override
    int count(int item) {
        int count = 0;
        for (int i : lst) {
            if (i == item)
                count++;
        }
        return count;
    }

    /**
     * @return How many items are in this multiset.
     */
    @Override
    int size() {
        return lst.size();
    }
}
