import java.util.List;

public class UnmodifiedSourceBook implements SourceBook{

    private final SourceBook sourceBook;

    public UnmodifiedSourceBook(SourceBook sourceBook) {
        this.sourceBook = sourceBook;
    }

    @Override
    public Integer getInformationElement(Integer index) {
        return sourceBook.getInformationElement(index);
    }

    @Override
    public void removeInformationElement(Integer index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Для этого класса не поддерживаются операции изменения");
    }

    @Override
    public int getSumOfInformationElements() {
        return sourceBook.getSumOfInformationElements();
    }

    @Override
    public List<Integer> getInformation() {
        return sourceBook.getInformation();
    }

    @Override
    public String toString() {
        return sourceBook.toString();
    }
}
