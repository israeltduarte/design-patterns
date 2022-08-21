package behavioral.observable;

public class Announcer {

    public NewsManager newsManager;

    public Announcer() {
        this.newsManager = new NewsManager();
    }

    public void publishNews(String news) {
        System.out.println("\nBREAKING NEWS! " + news);
        newsManager.notify(news);
    }

    public NewsManager getNewsManager() {
        return this.newsManager;
    }

    public void setNewsManager(NewsManager newsManager) {
        this.newsManager = newsManager;
    }
}
