import java.io.*;
import java.util.List;
import java.util.Objects;

public class Article implements Serializable, SourceBook {

    private List<Integer> information;
    private String name;
    private Integer numberInformationPages;

    public Article() {
    }

    public Article(List<Integer> information, String name, Integer numberInformationPages) {
        this.information = information;
        this.name = name;
        this.numberInformationPages = numberInformationPages;
    }

    public List<Integer> getInformation() {
        return information;
    }

    public void setInformation(List<Integer> information) {
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberInformationPages() {
        return numberInformationPages;
    }

    public void setNumberInformationPages(Integer numberInformationPages) {
        this.numberInformationPages = numberInformationPages;
    }

    @Override
    public Integer getInformationElement(Integer index) {
        return information.get(index);
    }

    public void addInformationElement(int value) {
        information.add(value);
    }

    @Override
    public void removeInformationElement(Integer index) {
        information.remove(index);
    }

    @Override
    public int getSumOfInformationElements() {
        int result = -1;
        if (information != null) {
            result = information.stream().mapToInt(i -> i).sum();
        } else {
            throw new NullPointerException("information is \"null\"");
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return information.equals(article.information)
                && name.equals(article.name) && numberInformationPages.equals(article.numberInformationPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(information, name, numberInformationPages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Article{");
        sb.append("information=").append(information);
        sb.append(", name='").append(name).append('\'');
        sb.append(", numberInformationPages=").append(numberInformationPages);
        sb.append('}');
        return sb.toString();
    }
}


