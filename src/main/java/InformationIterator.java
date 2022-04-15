import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class InformationIterator implements Iterator<Integer> {

    private List<Integer> information;
    private int index;

    public InformationIterator(List<Integer> information) {
        this.information = information;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < information.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int result = information.get(index);
        index++;
        return result;
    }
}
