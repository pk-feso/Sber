package less14.home.service;

public class SlowService implements Service {
    @Override
    public void run(Object o) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(o);
    }
}
