import java.util.List;

public class EssayFactory implements SourceBookFactory {

    @Override
    public SourceBook createInstance() {
        return new Essay();
    }

    @Override
    public SourceBook createInstance(List<Integer> information, String name, Integer numberInformationPages) {
        return new Essay(information, name, numberInformationPages);
    }
}
