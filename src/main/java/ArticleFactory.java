import java.util.List;

public class ArticleFactory implements SourceBookFactory {

    @Override
    public SourceBook createInstance() {
        return new Article();
    }

    @Override
    public SourceBook createInstance(List<Integer> information, String name, Integer numberInformationPages) {
        return new Article(information, name, numberInformationPages);
    }

}
