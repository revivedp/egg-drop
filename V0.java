import java.util.Random;

public class V0 {

    public static boolean dropEgg(int floor, int T){
        return floor >= T;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int totalFloors = Integer.parseInt(args[0]);
        int T = random.nextInt(totalFloors) + 1;

        int attempts = 0;
        int currentFloor = 1;

        while (currentFloor <= totalFloors){
            attempts++;
            if (dropEgg(currentFloor, T)){
                System.out.println("Egg BROKEN at " + T);
                System.out.println("Total attempts: " + attempts);
                break;
            } else {
                System.out.println("Egg PASSED at " + currentFloor);
            }
            currentFloor ++;
        }
    }
}
