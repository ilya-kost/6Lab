import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.List;

public interface SourceBook {

    Integer getInformationElement(Integer index);

    void removeInformationElement(Integer index);

    int getSumOfInformationElements();

    List<Integer> getInformation();
}
