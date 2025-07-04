import java.util.Random;

public class V2 {

    public static boolean dropEgg(int floor, int T){
        return floor >= T;
    }

    public static int findHigh(int totalFloors, int T){
        int floor = 1;
        while(floor <= totalFloors && !dropEgg(floor, T)){
            System.out.println("Egg PASSED at " + floor);
            floor *= 2;
        }
        System.out.println("Egg BROKEN at " + floor);
        return floor;
    }


    public static void main(String[] args) {

        Random random = new Random();

        int upperBound = Integer.parseInt(args[0]);

        int totalFloors = random.nextInt(upperBound);
        int T = random.nextInt(totalFloors) + 1;
        int attempts = 0;

        int high = findHigh(totalFloors, T);
        int low = high / 2;

        System.out.println("High: " + high);
        System.out.println("Low: " + low);

        while (low < high){
            attempts++;
            int mid = (low + high) / 2;
            if (dropEgg(mid, T)){
                System.out.println("Egg BROKEN at " + mid);
                high = mid;
            } else {
                System.out.println("Egg PASSED at " + mid);
                low = mid + 1;
            }
        }
        System.out.println("T floor found at " + low + " in " + attempts + " attempts.");
    }
}
