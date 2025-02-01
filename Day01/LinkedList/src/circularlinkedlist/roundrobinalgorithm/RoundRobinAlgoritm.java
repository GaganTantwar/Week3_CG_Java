package circularlinkedlist.roundrobinalgorithm;

public class RoundRobinAlgoritm {
    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin(4);

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.simulateScheduling();
    }
}
