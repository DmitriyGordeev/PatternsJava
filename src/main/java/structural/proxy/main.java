package structural.proxy;

public class main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.readSomeNews(-10);
        boolean bossAngry = boss.isAngry();


        Proxy proxy = new Proxy(boss);
        proxy.readSomeNews(-80);
        boolean proxyBossAngry = proxy.isAngry();

    }
}
