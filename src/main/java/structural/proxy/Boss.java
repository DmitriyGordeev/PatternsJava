package structural.proxy;

public class Boss {

    float happiness;

    Boss() { happiness = 100.0f; }

    public void readSomeNews(float news) {
        happiness += news;
    }

    public boolean isAngry() {
        return (happiness < 50);
    }
}
