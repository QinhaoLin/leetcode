package easy.t2561;

public class Main {
    public static void main(String[] args) {
        int arrivalTime = 13;
        int delayedTime = 1;
        Main main = new Main();
        int i = main.findDelayedArrivalTime(arrivalTime, delayedTime);
        System.out.println("i = " + i);
    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

}
