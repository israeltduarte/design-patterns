package behavioral.observable;

import java.util.ArrayList;
import java.util.List;

public class NewsManager {
    
    List<NewsListener> listeners = new ArrayList<>();

    public NewsManager() {}

    public void subscribe(NewsListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(NewsListener listener) {
        listeners.remove(listener);
    }

    public void notify(String news) {
        for (NewsListener listener : listeners) {
            listener.update(news);
        }
    }

    public List<NewsListener> getListeners() {
        return this.listeners;
    }
}