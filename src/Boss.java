public class Boss {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        Container container = new Container();Consumer consumer = new Consumer(container, lock);
        Producer producer = new Producer(container, lock);
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
