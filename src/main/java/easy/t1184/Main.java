package easy.t1184;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-29 09:08
 */
public class Main {

    public static void main(String[] args) {
        int[] distance = {7,10,1,12,11,14,5,0};
        int start = 2;
        int destination = 7;
//        int[] distance = {1, 2, 3, 4};
//        int start = 0;
//        int destination = 1;
        System.out.println("new Main().distanceBetweenBusStops() = " + new Main().distanceBetweenBusStops(distance, start, destination));
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // Ë³ĞĞ
        int antegrade = 0;
        // ÄæĞĞ
        int retrograde = 0;
        if (start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                antegrade += distance[i];
            }
            if (i < start || i >= destination) {
                retrograde += distance[i];
            }
        }
        System.out.println("antegrade = " + antegrade);
        System.out.println("retrograde = " + retrograde);
        return Math.min(antegrade, retrograde);
    }
}
