import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {
        SourceBookFactory sourceBookFactory = new ArticleFactory();
        Article article = (Article) sourceBookFactory.createInstance(new ArrayList<>(), "irwejg", 85);
        article.addInformationElement(39);
        article.addInformationElement(3);
        article.addInformationElement(56);
        article.addInformationElement(888);
        article.addInformationElement(777);
        InformationIterator e = new InformationIterator(article.getInformation());
        for (int i = 0; i < article.getInformation().size(); i++) {
            System.out.println(e.hasNext());
            System.out.println(e.next());
        }
    }
}
