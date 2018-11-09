package structural.proxy;

public class Proxy {
    Boss boss;
    public Proxy(Boss boss) {
        this.boss = boss;
    }

    public void readSomeNews(float news) {
        if(news < -51)
            return;

        boss.readSomeNews(news);
    }

    public boolean isAngry() {
        return boss.isAngry();
    }
}
