import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static void main(String[] args) throws IOException {
        List<PreveousMatch> preveousMatchList = new ArrayList<PreveousMatch>();
        List<UpcommingMatch> upcommingMatchList = new ArrayList<UpcommingMatch>();
        String urlPrevMatch = "https://www.cybersport.ru/base/match?disciplines=21&status=past&page=1";
        String urlUpcomMatch = "https://www.cybersport.ru/base/match?disciplines=21&status=future&page=1";
        Document docPrevMatch = Jsoup.connect(urlPrevMatch).get();
        Document docUpcomMatch = Jsoup.connect(urlUpcomMatch).get();
        Elements elementsPrev = docPrevMatch.getElementsByAttributeValue("class", "matches__item");

        elementsPrev.forEach(elementsPrev ->{
            Element element = elementsPrev.child(3);
            String nameLeftTeam = element.attr("href");

        });
    }

}
