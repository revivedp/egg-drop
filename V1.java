import java.util.Random;

public class V1 {

    public static boolean dropEgg(int floor, int T){
        return floor >= T;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int totalFloors = Integer.parseInt(args[0]);
        int T = random.nextInt(totalFloors) + 1;

        int attempts = 0;

        int low = 1;
        int high = totalFloors;

        while (low < high){
            attempts++;
            int mid = (low + high) / 2;
            if(dropEgg(mid, T)){
                System.out.println("Egg BROKEN at: " + mid);
                high = mid;
            } else{
                System.out.println("Egg PASSED at: " + mid);
                low = mid + 1;
            }
        }

        System.out.println("Low: " + low);
        System.out.println("T: " + T);
        System.out.println("Attempts: " + attempts);

    }
}
