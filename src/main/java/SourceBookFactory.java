import java.util.List;

public interface SourceBookFactory {

    SourceBook createInstance();

    SourceBook createInstance(List<Integer> information, String name, Integer numberInformationPages);
}
